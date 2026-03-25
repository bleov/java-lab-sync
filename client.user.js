// ==UserScript==
// @name         Java Lab Sync
// @namespace    https://pikarocks.dev
// @version      1.0
// @description  Connects to a java lab sync server to allow editing java lab code externally
// @author       pikapower9080
// @match        https://studio.code.org/projects/javalab/*
// @match        https://studio.code.org/courses/*/units/*/lessons/*/levels/*
// @icon         https://twemoji.pikarocks.dev/emojis/1f504.svg
// @grant        none
// ==/UserScript==

let lastData;

const ws = new WebSocket("wss://jlsync.code.org");
const packageRegex = /package ([a-zA-Z0-9]+.)+;\n/;

let config = {};

function checkFilePath(path) {
  const inputParts = path.split("/");
  const pathParts = location.pathname.split("/");
  pathParts.shift();
  console.log("inputParts", inputParts, "pathParts", pathParts);

  // course name
  // if (inputParts[1] !== pathParts[1]) {
  //   return;
  // }

  // unit number
  const check2A = inputParts[2] ? inputParts[2].replace("u", "") : undefined;
  if (check2A !== pathParts[3]) {
    return;
  }

  // lesson number
  const check3A = inputParts[3] ? inputParts[3].replace("l", "") : undefined;
  if (check3A !== pathParts[5]) {
    return;
  }

  // level number
  const check4A = inputParts[4] ? inputParts[4].replace("lv", "") : undefined;
  if (check4A !== pathParts[7]) {
    return;
  }

  // sublevel number
  if (inputParts[5] && inputParts[5].replace("sl", "") !== pathParts[9]) {
    return;
  }

  const fileName = inputParts[inputParts.length - 1];
  console.log("Returning file name:", fileName);
  return fileName;
}

function getLevelData() {
  return new Promise((res, rej) => {
    const levelDataInterval = setInterval(() => {
      if (window.appOptions && window.appOptions.level) {
        clearInterval(levelDataInterval);
        res(window.appOptions.level);
      }
    }, 100);
  });
}

async function save(source) {
  await fetch(`https://studio.code.org/v3/sources/${window.appOptions.channel}/main.json?replace=true`, {
    credentials: "include",
    headers: {
      "User-Agent": navigator.userAgent,
      Accept: "*/*",
      "Accept-Language": "en-US,en;q=0.5",
      "Content-Type": "application/json; charset=utf-8",
      "X-Requested-With": "XMLHttpRequest",
      "Sec-GPC": "1",
      "Sec-Fetch-Dest": "empty",
      "Sec-Fetch-Mode": "cors",
      "Sec-Fetch-Site": "same-origin"
    },
    body: JSON.stringify({
      source,
      animations: {},
      inRestrictedShareMode: false,
      teacherHasConfirmedUploadWarning: appOptions.level.teacherHasConfirmedUploadWarning
    }),
    method: "PUT",
    mode: "cors"
  });
}

function waitForElement(selector) {
  return new Promise((resolve) => {
    if (document.querySelector(selector)) {
      return resolve(document.querySelector(selector));
    }

    const observer = new MutationObserver((mutations) => {
      if (document.querySelector(selector)) {
        observer.disconnect();
        resolve(document.querySelector(selector));
      }
    });

    observer.observe(document.body, {
      childList: true,
      subtree: true
    });
  });
}

function runTests() {
  ws.send(JSON.stringify({ type: "log", message: "Running tests..." }));
  document.querySelector("#testButton").click();
}

ws.onopen = () => {
  console.log("🔄 Connected to JavaLab Sync");

  getLevelData().then((levelData) => {
    ws.send(
      JSON.stringify({
        type: "levelData",
        level: levelData,
        path: location.pathname
      })
    );
  });
};

ws.onerror = () => {
  console.warn("🔄 Could not connect to the JavaLab sync server, is it running?");
};

ws.onmessage = (message) => {
  const msg = JSON.parse(message.data);
  switch (msg.type) {
    case "change":
      const fileName = checkFilePath(msg.file);
      if (!fileName) {
        console.log("🔄 Ignoring change for file", msg.file);
        return;
      }
      console.log("🔄 ", fileName, " changed");
      ws.send(JSON.stringify({ type: "log", message: `update: ${fileName}` }));
      const source = window.appOptions.getCode();
      source[fileName].text = msg.content.replace(packageRegex, "");
      console.log(source);
      save(source).then(() => {
        if (config.auto_reload) {
          location.reload();
          return;
        }
        if (config.auto_test) {
          runTests();
        }
      });
      break;
    case "run":
      runTests();
      break;
    case "config":
      config = msg.config;
      console.log("🔄 Received config from sever: ", msg.config);
      break;
    default:
      console.log("🔄 Received message of unknown type ", msg);
      break;
  }
};

window.syncSocket = ws;

const consoleSelector = "div.javalab-console div";

waitForElement(consoleSelector).then((consoleElm) => {
  const observer = new MutationObserver(function (mutations) {
    mutations.forEach(function (mutation) {
      if (mutation.addedNodes.length == 0) return;
      const node = mutation.addedNodes[0];
      if (!node || !node.innerText || node.id == "console-input") return;
      if (node.querySelector && node.querySelector("#console-input")) return;
      console.log(node.innerText);
      ws.send(JSON.stringify({ type: "console", message: node.innerText }));
    });
  });
  observer.observe(consoleElm, { childList: true, subtree: false });
});

console.log("🔄 Loaded JavaLab Sync Client%c", "font-size: 50px;");
