# Java Real-Time Chat App (Socket Based)

This is a real-time **client-server chat application** built using Java Socket programming. The system demonstrates full-duplex communication where:
🟢 The **server** can send messages manually to the client.
🔵 The **client** responds manually like a real-time user.
🕐 If a client sends a message during the server's *"busy time"* (12 PM to 4 PM), they receive an **automated "I'm busy"** reply from the server.

💡 Features

Manual two-way message exchange between server and client
Busy time auto-response logic
Multithreaded read-write communication

## 🚀 How to Run (Step-by-Step)

> 💡 Make sure you have Java installed.

### ✅ 1. Compile and Run the Server

Open a terminal:

```bash
cd ChatSocketProject/server
javac ChatSocketServer.java
java ChatSocketServer

Open another terminal:

cd ChatSocketProject/client
javac ChatSocketClient.java
java ChatSocketClient.java

**How It Works**

The server listens for client connections.
Once the client connects, both can type messages manually in real time.

The server checks if it’s within busy hours (12 PM – 4 PM).
If yes, it sends an auto-reply: "Server: I'm busy".

Typing "bye" closes the connection.

**Demo Screenshots:**

🖥️ Server Message Output:
![WhatsApp Image 2025-07-08 at 14 54 53_6042291f](https://github.com/user-attachments/assets/c337c2f1-71f3-4d96-9b59-7e82caebf306)

💬 Client Message Output:
![WhatsApp Image 2025-07-08 at 14 55 12_d6ee266a](https://github.com/user-attachments/assets/614fb0c7-ae44-41bf-82fa-cf1c6b5a9c7d)

🕐 Server Busy Auto Reply (During 12–4 PM):
![WhatsApp Image 2025-07-08 at 14 56 42_7a91466b](https://github.com/user-attachments/assets/e95c9dd1-d812-40e3-ad19-6ef8d9d2b730)

✍️ Author
Devesh Jhajharia
📧 [**Email -** deveshjhajharia714@gmail.com]


