# Day 87: Implementing a Simple Chat Server

## 📝 Description

On Day 87 of my 100 Days of Code challenge, I implemented a simple chat server using **Sockets** in Java. The server listens for client connections and facilitates basic communication between a client and a server.

### **Objective:**
- Build a server that can accept a client connection.
- Enable basic message exchanges between a client and server.

## 🚀 Code Overview

This Java program:
1. Uses `ServerSocket` to set up a server and accept incoming connections.
2. Manages message exchanges using `InputStream` and `OutputStream`.
3. Demonstrates basic networking concepts in Java.

### **Concepts Covered:**
- Java Sockets (`ServerSocket` and `Socket`)
- Networking concepts such as server-client communication
- I/O streams for message exchanges

## 📂 File Structure
- `Day 87/`
  - `ChatServer.java`: Java program for the server.
  - `ChatClient.java`: Java program for the client.
  - `README.md`: This description file.

## 📋 How to Run

1. **Compile both server and client files:**
   ```bash
   javac ChatServer.java ChatClient.java
   ```

2. **Start the server:**
   ```bash
   java ChatServer
   ```

3. **Run the client in a separate terminal:**
   ```bash
   java ChatClient
   ```

4. **Follow prompts to send and receive messages.**

## 🔍 Example Output

**Server Terminal:**
```plaintext
Server started. Waiting for client...
Client connected.
Client says: Hello Server!
Server says: Hello Client!
```

**Client Terminal:**
```plaintext
Connected to server.
Enter message for server: Hello Server!
Server says: Hello Client!
```

**Day 87 complete!** On to Day 88!

