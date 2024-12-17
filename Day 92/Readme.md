## **Day 92: Multithreading Example - Sum of Array**

## 📝 Description

On Day 92 of my 100 Days of Code challenge, I implemented a Java program to calculate the sum of an array using multithreading. The program splits the array into two parts and computes the sum of each part using separate threads.

### **Objective:**
- Use multithreading to improve computational efficiency.
- Learn how to manage threads with `start()` and `join()`.

## 🚀 Code Overview

This program:
1. Creates an array of integers.
2. Splits the array into two parts.
3. Calculates the sum of each part using two separate threads.
4. Combines the results to get the total sum.

### **Concepts Covered:**
- Multithreading in Java.
- Thread synchronization using `join()`.

## 📂 File Structure
- `Day 92/`
  - `SumArrayMultiThread.java`: Java program to compute the sum of an array using threads.
  - `README.md`: This description file.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac SumArrayMultiThread.java
   ```

2. **Run the program:**
   ```bash
   java SumArrayMultiThread
   ```

3. **Output:**
   Displays the total sum of the array.

## 🔍 Example Output

```plaintext
Total sum of the array: 500500
```
**Day 92 complete!** On to Day 93!