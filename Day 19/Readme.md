# Day 19: Fibonacci Sequence

## 📝 Description

On Day 19 of my 100 Days of Code challenge, I worked on writing a Java program to generate the Fibonacci Sequence. The program calculates the Fibonacci numbers up to a given term specified by the user. The Fibonacci Sequence is a series of numbers where each number is the sum of the two preceding ones, typically starting with 0 and 1.

### **Objective:**
- Practice loops and conditionals.
- Work with arrays or variables to generate a sequence of numbers.
- Understand the structure and logic behind recursive and iterative functions.

## 🚀 Code Overview

The program asks the user to input how many terms of the Fibonacci sequence they want to see. Using either iteration or recursion, the program calculates each Fibonacci number in sequence and prints them out.

### **1. Fibonacci Sequence Generator**
This program generates the Fibonacci Sequence using the following approach:
```
fib(n) = fib(n-1) + fib(n-2)
```
Where:
- `fib(0) = 0`
- `fib(1) = 1`

- The user inputs the number of terms (`n`).
- The program calculates the sequence iteratively or recursively.
- The Fibonacci sequence is printed up to the nth term.

## 📂 File Structure
- `Day19/`
  - `FibonacciSequence.java`: Contains the Java program to generate the Fibonacci sequence.
  - `README.md`: This description file.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac FibonacciSequence.java
   ```
2. **Run the program:**
   ```bash
   java FibonacciSequence
   ```

3. **Input the number of terms as prompted.**

## 🔍 Example Output

### **Example 1:**
```plaintext
Enter the number of terms: 5
Fibonacci Sequence:
0, 1, 1, 2, 3
```

### **Example 2:**
```plaintext
Enter the number of terms: 8
Fibonacci Sequence:
0, 1, 1, 2, 3, 5, 8, 13
```

---

**Day 19 complete!** On to Day 20!
