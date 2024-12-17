# Day 84: Handle HTTP GET Request Using Java

## 📝 Description

On Day 84 of my 100 Days of Code challenge, I implemented an HTTP GET request in Java to retrieve data from a server. This task involved fetching and processing JSON data, showcasing how to consume APIs using Java's `HttpURLConnection`.  

### **Objective:**
- Send an HTTP GET request to a specified URL.
- Read and display the server's response.

---

## 🚀 Code Overview

The program performs the following steps:
1. Connects to the specified URL using `HttpURLConnection`.
2. Sends an HTTP GET request.
3. Reads the server's response using a `BufferedReader`.
4. Displays the response and response code on the console.

---

## 📂 File Structure

- `Day 84/`
  - `HttpGetRequest.java`: Java program to send an HTTP GET request.
  - `README.md`: This description file.

---

## 📋 How to Run

1. **Compile the program:**
   ```bash
   javac HttpGetRequest.java
   ```

2. **Run the program:**
   ```bash
   java HttpGetRequest
   ```

---

## 🔍 Example Output

```plaintext
Response Code: 200
Response: {"userId":1,"id":1,"title":"Sample Title","body":"This is a sample body."}
```

---

**Day 84 complete!** On to Day 85! 🎉

--- 