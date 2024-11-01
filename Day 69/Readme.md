# Day 69: Implement a HashMap

## 📝 Description

On Day 69 of my 100 Days of Code challenge, I implemented a basic `HashMap` structure in Java. A `HashMap` is a data structure that stores key-value pairs for quick retrieval based on a unique key.

### **Objective:**
- Implement a basic HashMap with add, get, and remove operations.
- Practice handling key-value pairs and hash functions.

## 🚀 Code Overview

This Java program:
1. Defines a `Node` class to store key-value pairs in a bucket.
2. Uses an array to hold linked lists for handling collisions (chaining method).
3. Implements `put`, `get`, and `remove` methods to add, retrieve, and delete key-value pairs.

### **Concepts Covered:**
- Hashing with modular division.
- Basic linked list chaining for collision handling.

## 📂 File Structure
- `Day 69/`
  - `HashMapExample.java`: The main Java program implementing a simple HashMap.
  - `README.md`: This description file.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac HashMapExample.java
   ```
2. **Run the program:**
   ```bash
   java HashMapExample
   ```

## 🔍 Example Output

```plaintext
Adding key: 1, value: "One"
Value for key 1: One
Removing key: 1
Value for key 1 after removal: null
```

---

**Day 69 complete!** On to Day 70!
