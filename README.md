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

- Open a terminal:

```bash
cd ChatSocketProject/server
javac ChatSocketServer.java
java ChatSocketServer

- Open another terminal:

cd ChatSocketProject/client
javac ChatSocketClient.java
java ChatSocketClient.java

Demo Screenshots
(You can insert your screenshots below in these placeholders)

🖥️ Server Message Output
  
  

💬 Client Message Output

🕐 Server Busy Auto Reply (During 12–4 PM)
