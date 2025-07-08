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
![WhatsApp Image 2025-07-08 at 14 54 53_6ed606d6](https://github.com/user-attachments/assets/8ba9e19b-7dd2-44ae-8a05-a1f25430409f)


💬 Client Message Output:
![WhatsApp Image 2025-07-08 at 14 55 12_f4f26372](https://github.com/user-attachments/assets/445f4294-da59-4379-8b13-2fb6e9f1a52e)




🕐 Server Busy Auto Reply (During 12–4 PM):
![WhatsApp Image 2025-07-08 at 14 56 42_d684ab0b](https://github.com/user-attachments/assets/c9dd2195-5d0f-4df4-9590-8843127b284c)






✍️ Author
Devesh Jhajharia
📧 [**Email -** deveshjhajharia714@gmail.com]


