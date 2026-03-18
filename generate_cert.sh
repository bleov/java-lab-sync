mkdir -p tls
openssl req -new -newkey rsa:4096 -x509 -sha256 -days 365 -nodes -out ./tls/cert.pem -keyout ./tls/key.pem