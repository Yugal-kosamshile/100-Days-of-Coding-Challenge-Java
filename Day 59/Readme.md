# Day 59: Read and Write Files

## 📝 Description

On Day 59 of my 100 Days of Code challenge, I wrote a Java program to demonstrate how to **read** from a file and **write** to a file. This is a fundamental operation when working with data persistence and file handling in Java. The program reads text from an input file, writes the content to an output file, and displays the content of both files.

### **Objective:**
- Learn how to handle file input and output (I/O) in Java.
- Implement basic file reading and writing operations.

## 🚀 Code Overview

This Java program:
1. Reads content from a file (input.txt).
2. Writes the content to another file (output.txt).
3. Displays the contents of both the input and output files.

### **Concepts Covered:**
- File I/O in Java using classes like `FileReader`, `FileWriter`, and `BufferedReader`.
- Handling exceptions related to file operations (e.g., `IOException`).
- Basic file handling (read/write/close operations).

## 📂 File Structure
- `Day 59/`
  - `FileReadWrite.java`: The main Java program to read and write to files.
  - `input.txt`: The input file containing the text to read.
  - `output.txt`: The output file where the text will be written.
  - `README.md`: This description file.

## 📋 How to Run
1. **Ensure the input file (`input.txt`) exists** with some text in it.
2. **Compile the program:**
   ```bash
   javac FileReadWrite.java
   ```
3. **Run the program:**
   ```bash
   java FileReadWrite
   ```

## 🔍 Example Input/Output

### Input (`input.txt`):
```plaintext
Hello, World!
This is a file read/write test.
```

### Output (`output.txt`):
```plaintext
Hello, World!
This is a file read/write test.
```

Console Output:
```plaintext
Reading from input.txt:
Hello, World!
This is a file read/write test.

Writing to output.txt complete.
```

---

**Day 59 complete!** On to Day 60!
