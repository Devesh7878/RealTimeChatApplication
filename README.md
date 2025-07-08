# Java Real-Time Chat App (Socket Based)

This is a real-time **client-server chat application** built using Java Socket programming. The system demonstrates full-duplex communication between two terminals.

- 🟢 The **server** sends messages manually to the client.
- 🔵 The **client** responds manually like a real user.
- 🕐 If the client sends a message during the server's *"busy time"* (12 PM to 4 PM), the server sends an **automated response**: `"Server: I'm busy"`.

---


## 💡 Features

- ✅ Manual two-way messaging between server and client  
- 🕐 Busy-time detection with automatic response  
- ⚙️ Multithreaded architecture for real-time chat  
- 🔐 Optional Ngrok support for public IP exposure

---

## 📁 Folder Structure

ChatSocketProject/
├── server/
│ └── ChatSocketServer.java
├── client/
│ └── ChatSocketClient.java

📸 Demo Screenshots
🖥️ Server Message Output

![WhatsApp Image 2025-07-08 at 14 54 53_0c7922e7](https://github.com/user-attachments/assets/4bd3af51-ba74-4e4e-9f0e-923d455143de)


💬 Client Message Output

![WhatsApp Image 2025-07-08 at 14 55 12_50899e2f](https://github.com/user-attachments/assets/13440830-6921-41b6-b0c5-05c3f254f543)


🕐 Server Busy Auto Reply (During 12–4 PM)

![WhatsApp Image 2025-07-08 at 14 56 42_dba0fb64](https://github.com/user-attachments/assets/614a0098-bf73-4b9d-9178-d117d388c387)


## 🚀 How to Run

💡 **Make sure Java is installed** (`java -version`), and Ngrok is optional if you want public access.

## 🟢 Step 1: Run the Server

```bash
cd ChatSocketProject/server
javac ChatSocketServer.java
java ChatSocketServer

🔵 Step 2: Run the Client (in a New Terminal)

cd ChatSocketProject/client
javac ChatSocketClient.java
java ChatSocketClient

**How It Works**

The server runs on port 3339 and listens for incoming client connections.
Once connected, both server and client can send/receive messages manually.
If the server receives a message between 12 PM and 4 PM, it replies:

Server: I'm busy
Typing "bye" from the client or server ends the chat session.

✍️ Author
Devesh Jhajharia
📧 Email: deveshjhajharia714@gmail.com
