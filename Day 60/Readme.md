# Day 60: Handle File Exceptions

## 📝 Description

On Day 60 of my 100 Days of Code challenge, I implemented a Java program to handle file-related exceptions. When working with file input and output (I/O) in Java, it is crucial to manage exceptions properly, especially when files are missing, inaccessible, or when read/write operations fail. This program demonstrates how to handle such exceptions gracefully.

### **Objective:**
- Learn how to handle file-related exceptions like `FileNotFoundException`, `IOException`, and others.
- Implement robust file I/O operations with proper error handling and resource management.

## 🚀 Code Overview

This Java program:
1. Attempts to read from a file (`input.txt`).
2. Attempts to write to a file (`output.txt`).
3. Handles exceptions such as `FileNotFoundException` and `IOException`.
4. Uses `try-catch` blocks to handle different types of file-related errors.

### **Concepts Covered:**
- Handling `FileNotFoundException` when the input file does not exist.
- Handling `IOException` for general I/O errors.
- Proper resource management using `try-with-resources` for automatic closing of resources.

## 📂 File Structure
- `Day 60/`
  - `FileExceptionHandling.java`: The main Java program to handle file exceptions.
  - `input.txt`: The input file to read from (optional; will cause an error if not present).
  - `README.md`: This description file.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac FileExceptionHandling.java
   ```
2. **Run the program:**
   ```bash
   java FileExceptionHandling
   ```

## 🔍 Example Input/Output

### Case 1: File Not Found

If `input.txt` does not exist:
```plaintext
Error: File not found - input.txt
```

### Case 2: General I/O Exception

If there's an I/O error while writing to `output.txt`:
```plaintext
An I/O error occurred while writing to output.txt: <error_message>
```

### Case 3: Success

If everything runs successfully:
```plaintext
Reading from input.txt:
Hello, World!
File reading complete.

Writing to output.txt complete.
```

---

**Day 60 complete!** On to Day 61!
