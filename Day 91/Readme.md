## **Day 91: File Decompression Using GZIP**

## 📝 Description

On Day 91 of my 100 Days of Code challenge, I implemented a Java program to decompress a GZIP-compressed file. This program reads a `.gz` file, decompresses it, and writes the output to a new file.

### **Objective:**
- Understand GZIP decompression in Java.
- Use `GZIPInputStream` to read and decompress files.

## 🚀 Code Overview

This program:
1. Takes a compressed file (`.gz`).
2. Decompresses it using `GZIPInputStream`.
3. Writes the decompressed content to an output file.

### **Concepts Covered:**
- File I/O operations.
- GZIP decompression in Java.

## 📂 File Structure
- `Day 91/`
  - `FileDecompressor.java`: Java program to decompress a GZIP file.
  - `README.md`: This description file.

## 📋 How to Run
1. **Prepare a compressed file:**
   Place a file named `compressed.gz` in the program directory.

2. **Compile the program:**
   ```bash
   javac FileDecompressor.java
   ```

3. **Run the program:**
   ```bash
   java FileDecompressor
   ```

4. **Output:**
   A decompressed file `output.txt` will be created.

## 🔍 Example Output

```plaintext
File decompressed successfully: output.txt
```

**Day 91 complete!** On to Day 92!
