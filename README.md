# Code.org Java Lab Sync

This project allows you to edit Code.org java lab assignments in an external editor such as VScode, and sync your changes back to the browser in real time. It also includes types for code.org libraries to provide autocomplete.

## Requirements

- A linux or macOS machine with root access
- Bun.js
- Violetmonkey or another userscript manager
- Port 443 available (required due to CSP)

## Setup

1. Add `127.0.0.1 jlsync.code.org` to your `/etc/hosts` file
2. Run the `generate_cert.sh` script to create an self-signed SSL certificate
3. Run `bun start` as root (needed to open port 443)
   - Remember that bun might not be in the PATH when running with sudo or as root
4. Visit https://jlsync.code.org and accept the security risk (self signed certificate)
5. Install https://jlsync.code.org/client.user.js using a userscript manager
6. Refresh code.org while the server is running and check the levels directory for your files!
7. Upon saving, your code will sync back to the browser. It will not appear in the built-in editor, but it should still work when you click run. Refresh to show changes.
