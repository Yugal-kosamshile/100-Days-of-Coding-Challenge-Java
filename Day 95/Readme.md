# Day 95: Implement a Command-Line Parser

## 📝 Description

On Day 95 of my 100 Days of Code challenge, I implemented a simple command-line argument parser in Java. This program takes arguments in the format `key=value` and parses them.

### **Objective:**
- Parse command-line arguments into key-value pairs.
- Handle invalid argument formats gracefully.

## 🚀 Code Overview

This Java program:
1. Accepts arguments in `key=value` format.
2. Splits each argument into key and value.
3. Displays the parsed key-value pairs.

### **Concepts Covered:**
- Command-line argument parsing.
- String manipulation using `split()`.

## 📂 File Structure
- `Day 95/`
  - `CommandLineParser.java`: Java program to parse command-line arguments.
  - `README.md`: This description file.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac CommandLineParser.java
   ```
2. **Run the program with arguments:**
   ```bash
   java CommandLineParser key1=value1 key2=value2
   ```

## 🔍 Example Output

**Input Command:**
```bash
java CommandLineParser name=John age=25 country=USA
```

**Output:**
```plaintext
Parsed Command-Line Arguments:
Key: name, Value: John
Key: age, Value: 25
Key: country, Value: USA
```

---

**Day 95 complete!** On to Day 96!
