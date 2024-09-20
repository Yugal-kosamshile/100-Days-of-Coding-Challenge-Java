# Day 27: Find the Least Common Multiple (LCM)

## 📝 Description

On Day 27 of the 100 Days of Code challenge, I implemented a Java program to calculate the Least Common Multiple (LCM) of two numbers. This task solidifies the understanding of number theory concepts such as the Greatest Common Divisor (GCD) and its relationship to LCM.

### **Objective:**
- Write a Java program to calculate the LCM of two integers using the relationship between GCD and LCM:
  
  \[
  \text{LCM}(a, b) = \frac{|a \times b|}{\text{GCD}(a, b)}
  \]

## 🚀 Code Overview

The program performs the following steps:
1. Reads two integers from the user.
2. Uses the Euclidean algorithm to calculate the Greatest Common Divisor (GCD).
3. Computes the LCM using the formula:  
   \[
   \text{LCM}(a, b) = \frac{|a \times b|}{\text{GCD}(a, b)}
   \]
4. Outputs the LCM of the two numbers.

### **Concepts Covered:**
- Euclidean algorithm for GCD calculation.
- Mathematical relationship between GCD and LCM.
- Use of basic input/output and arithmetic in Java.

## 📂 File Structure
- `Day27/`
  - `FindLCM.java`: The main Java program.
  - `README.md`: This description file.

## 📋 How to Run

1. **Compile the program:**
   ```bash
   javac FindLCM.java
   ```
2. **Run the program:**
   ```bash
   java FindLCM
   ```
3. **Input two integers** when prompted to get their LCM.

## 🔍 Example Output

```plaintext
Enter first number: 12
Enter second number: 18
The LCM of 12 and 18 is: 36
```

## 💡 Lessons Learned
- Reinforced the concept of GCD and LCM.
- Learned the connection between GCD and LCM and how to apply it in solving problems programmatically.

---

**Day 27 complete!** Ready for the Day28! 😄
