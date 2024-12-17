# Day 97: Implement a Producer-Consumer Problem

## 📝 Description

On Day 97 of my 100 Days of Code challenge, I implemented a classic Producer-Consumer problem using Java threads and synchronization.

### **Objective:**
- Use threads to simulate producer and consumer operations.
- Handle shared buffer synchronization using `wait()` and `notify()`.

## 🚀 Code Overview

This Java program:
1. Uses a shared buffer with a fixed capacity.
2. Implements producer and consumer threads.
3. Ensures synchronized access to the buffer using `wait()` and `notify()`.

### **Concepts Covered:**
- Thread synchronization.
- `wait()` and `notify()` methods.
- Producer-Consumer problem.

## 📂 File Structure
- `Day 97/`
  - `ProducerConsumer.java`: Java program for the Producer-Consumer problem.
  - `README.md`: This description file.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac ProducerConsumer.java
   ```
2. **Run the program:**
   ```bash
   java ProducerConsumer
   ```

## 🔍 Example Output

```plaintext
Produced: 1
Consumed: 1
Produced: 2
Produced: 3
Consumed: 2
Produced: 4
...

**Day 97 complete!** On to Day 98!