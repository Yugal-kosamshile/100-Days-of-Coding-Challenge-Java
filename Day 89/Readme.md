# Day 89: Implementing JSON Parsing

## 📝 Description

On Day 89 of my 100 Days of Code challenge, I implemented a program to parse JSON strings into Java objects using the **Gson** library.

### **Objective:**
- Learn how to parse JSON strings into structured Java objects.
- Use external libraries (Gson) to simplify the process.

## 🚀 Code Overview

This Java program:
1. Includes a simple JSON string representing user data.
2. Parses the JSON into a Java class.
3. Demonstrates how to access parsed data.

### **Concepts Covered:**
- JSON parsing
- Using external libraries (Gson)
- Converting JSON to Java objects

## 📂 File Structure
- `Day 89/`
  - `JsonParser.java`: Java program to parse JSON.
  - `README.md`: This description file.

## 📋 How to Run

1. **Install Gson library:**
   - Download Gson JAR from [Maven Repository](https://mvnrepository.com/artifact/com.google.code.gson/gson).
   - Place it in the project directory.

2. **Compile the program:**
   ```bash
   javac -cp gson-2.8.6.jar JsonParser.java
   ```

3. **Run the program:**
   ```bash
   java -cp .:gson-2.8.6.jar JsonParser
   ```

## 🔍 Example Output

```plaintext
JSON Input:
{
  "name": "John Doe",
  "age": 25,
  "city": "New York"
}

Parsed Data:
Name: John Doe
Age: 25
City: New York
```
*Day 89 complete!** On to Day 90!