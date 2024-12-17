# Day 96: Handle Concurrency with Threads

## 📝 Description

On Day 96 of my 100 Days of Code challenge, I implemented a Java program to demonstrate concurrency using threads. Multiple threads are executed simultaneously to perform tasks.

### **Objective:**
- Learn how to use threads in Java.
- Handle concurrent tasks and understand thread lifecycle.

## 🚀 Code Overview

This Java program:
1. Implements the `Runnable` interface to define a task.
2. Starts multiple threads to execute tasks concurrently.
3. Uses `Thread.sleep` to simulate task processing.

### **Concepts Covered:**
- Threads in Java.
- `Runnable` interface and `Thread` class.
- Thread synchronization using `join()`.

## 📂 File Structure
- `Day 96/`
  - `ConcurrencyWithThreads.java`: Java program demonstrating concurrency.
  - `README.md`: This description file.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac ConcurrencyWithThreads.java
   ```
2. **Run the program:**
   ```bash
   java ConcurrencyWithThreads
   ```

## 🔍 Example Output

```plaintext
Starting Threads...
Thread 1 - Count: 1
Thread 2 - Count: 1
Thread 3 - Count: 1
Thread 1 - Count: 2
Thread 2 - Count: 2
Thread 3 - Count: 2
...
Thread 3 completed.
Thread 2 completed.
Thread 1 completed.
All threads have finished execution.
```

**Day 96 complete!** On to Day 97!
