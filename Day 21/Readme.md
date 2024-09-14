# Day 21: Sum of Digits in a Number

## 📝 Description

On Day 21 of my 100 Days of Code challenge, I focused on writing a Java program to calculate the sum of the digits in a given number. The program takes an integer input from the user and computes the sum of all its digits.

### **Objective:**
- Practice using loops in Java.
- Learn how to extract digits from a number and perform calculations with them.

## 🚀 Code Overview

The program prompts the user to enter an integer. It then calculates the sum of the digits by repeatedly extracting the last digit using the modulus operator (`%`) and removing the last digit using integer division (`/`). The sum is accumulated and printed at the end.

### **1. Sum of Digits Calculator**

This program calculates the sum of digits of a number using the following logic:
1. Repeatedly extract the last digit using `% 10`.
2. Add the extracted digit to the total sum.
3. Remove the last digit using `/ 10`.
4. Repeat until the number becomes `0`.


## 📂 File Structure
- `Day21/`
  - `SumOfDigits.java`: Contains the Java program to calculate the sum of digits in a number.
  - `README.md`: This description file.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac SumOfDigits.java
   ```
2. **Run the program:**
   ```bash
   java SumOfDigits
   ```
3. **Input a number when prompted.**

## 🔍 Example Output

### **Example 1:**
```plaintext
Enter a number: 12345
Sum of digits: 15
```

### **Example 2:**
```plaintext
Enter a number: 987
Sum of digits: 24
```

---

**Day 21 complete!** On to Day 22!

---
