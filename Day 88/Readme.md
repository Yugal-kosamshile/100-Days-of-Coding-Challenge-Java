
# Day 88: Implementing HTTP Request and Response Parsing

## 📝 Description

On Day 88 of my 100 Days of Code challenge, I implemented a basic program to parse **HTTP requests and responses**. This simulates a simple HTTP communication without needing a full server.

### **Objective:**
- Learn to structure and parse HTTP request and response messages.
- Understand HTTP request structure: **method**, **headers**, and **body**.

## 🚀 Code Overview

This Java program:
1. Simulates a simple HTTP request.
2. Parses the request to extract method, path, headers, and body.
3. Forms a basic HTTP response based on the request.

### **Concepts Covered:**
- HTTP protocol structure
- Parsing strings and headers in Java
- Simulating HTTP requests and responses

## 📂 File Structure
- `Day 88/`
  - `HttpRequestResponse.java`: Java program to parse and simulate HTTP messages.
  - `README.md`: This description file.

## 📋 How to Run

1. **Compile the program:**
   ```bash
   javac HttpRequestResponse.java
   ```

2. **Run the program:**
   ```bash
   java HttpRequestResponse
   ```

## 🔍 Example Output

```plaintext
--- HTTP Request ---
GET /index.html HTTP/1.1
Host: localhost
User-Agent: Java-Client

--- Parsed Request ---
Method: GET
Path: /index.html
Host: localhost
User-Agent: Java-Client

--- HTTP Response ---
HTTP/1.1 200 OK
Content-Type: text/html

Response Body: <h1>Hello, HTTP!</h1>
```
**Day 88 complete!** On to Day 89!