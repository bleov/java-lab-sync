import fs from "node:fs";
import type { Config, File, Level } from "./types";
import { $, ServerWebSocket } from "bun";
import chokidar from "chokidar";
import chalk from "chalk";
import readline from "node:readline";
import JSONC from "jsonc-simple-parser";

const mode = 0o777;

let currentWs: ServerWebSocket | null = null;

if (!fs.existsSync("./config.jsonc")) {
  if (!fs.existsSync("./default-config.jsonc")) {
    console.error(chalk.redBright("Neither a config.jsonc or default-config.jsonc file was not found."));
    process.exit(1);
  }
  console.log("Creating default config");
  fs.copyFileSync("./default-config.jsonc", "./config.jsonc");
  await $`chmod 777 config.jsonc`;
}
const config: Config = JSONC.parse(fs.readFileSync("./config.jsonc", "utf-8"));

if (!fs.existsSync("./levels")) {
  fs.mkdirSync("./levels", { recursive: true, mode });
  await $`chmod -R 777 levels`;
}

function removeItem(array: any[], item: any) {
  const index = array.indexOf(item);
  if (index > -1) {
    array.splice(index, 1);
  }
}

function toPascalCase(str: string) {
  return str
    .split(/[-_ ]+/)
    .map((word) => word.charAt(0).toUpperCase() + word.slice(1))
    .join("");
}

function getLevelPath(path: string) {
  const parts = path.split("/");
  parts.shift();
  removeItem(parts, "courses");
  removeItem(parts, "units");
  removeItem(parts, "lessons");
  removeItem(parts, "levels");
  removeItem(parts, "sublevel");
  parts[0] = toPascalCase(parts[0]);
  parts[1] = "u" + parts[1];
  parts[2] = "l" + parts[2];
  parts[3] = "lv" + parts[3];
  if (parts[4]) {
    parts[4] = "sl" + parts[4];
  }
  parts.unshift("levels");
  return parts.join("/");
}

function getBanner(path: string) {
  const pathParts = path.split("/");
  pathParts.pop();
  const packageName = pathParts.join(".");
  return `package ${packageName};\n\n`;
}

const watcher = chokidar.watch("./levels", {
  persistent: true
});

const rl = readline.createInterface(process.stdin, process.stdout);

function waitForEnter() {
  rl.question("", () => {
    if (currentWs) {
      currentWs.send(
        JSON.stringify({
          type: "run"
        })
      );
      waitForEnter();
    }
  });
}

const instructionsStyle = "<style>div[style] {color: #222222;}</style>";

watcher.on("change", (path) => {
  if (path.endsWith("CurrentInstructions.md")) {
    return;
  }
  currentWs?.send(
    JSON.stringify({
      type: "change",
      file: path,
      content: fs.readFileSync(path, "utf-8")
    })
  );
});
const server = Bun.serve({
  fetch(req) {
    const url = new URL(req.url);
    if (url.pathname === "/client.user.js" && req.method === "GET") {
      return new Response(Bun.file("./client.user.js"));
    }

    const success = server.upgrade(req);
    if (success) {
      return undefined;
    }

    return new Response("OK");
  },
  websocket: {
    async message(ws, message: string) {
      currentWs = ws;

      const data = JSON.parse(message);

      switch (data.type) {
        case "levelData":
          const levelData: Level = data.level;
          const path: string = data.path;
          const dirPath = getLevelPath(path);
          console.log(dirPath);
          if ("startSources" in levelData && typeof levelData.startSources == "object" && Object.keys(levelData.startSources).length > 0) {
            fs.mkdirSync(dirPath, { recursive: true, mode });
            for (const fileName in levelData.startSources) {
              const fileData: File = levelData.startSources[fileName];
              const filePath = `${dirPath}/${fileName}`;
              if (!fs.existsSync(filePath)) {
                await Bun.write(filePath, getBanner(filePath) + fileData.text, { mode });
              }
            }
            if (levelData.longInstructions) {
              const instructionsPath = `levels/CurrentInstructions.md`;
              await Bun.write(instructionsPath, instructionsStyle + "\n" + levelData.longInstructions, { mode });
            }
            await $`chmod -R 777 levels`;
          } else {
            console.log("No code on this level");
          }
          waitForEnter();
          break;
        case "console":
          if (config.trim_output) {
            if (data.message.trim() === "") {
              return;
            }
          }
          console.log(`${chalk.gray("[output]")} ${data.message}`);
          break;
        case "log":
          console.log(`${chalk.gray("[client]")} ${data.message}`);
          break;
        default:
          break;
      }
    },
    async open(ws) {
      currentWs = ws;
      ws.send(JSON.stringify({ type: "config", config }));
      console.log("Connected to client");
    }
  },
  port: 443,
  tls: {
    key: Bun.file("./tls/key.pem"),
    cert: Bun.file("./tls/cert.pem"),
    serverName: "jlsync.code.org"
  }
});

console.log(`Server running on on ${server.hostname}:${server.port}`);
