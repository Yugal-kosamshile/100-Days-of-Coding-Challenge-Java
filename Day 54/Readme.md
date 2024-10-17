# Day 54: Find the Sum of Digits Until One Digit

## 📝 Description

On Day 54 of my 100 Days of Code challenge, I wrote a Java program to find the sum of the digits of a given number repeatedly until the result is a single digit. This process is often referred to as "digit root" or "repeated digit sum."

For example, the number 9875 has the digit sum 9 + 8 + 7 + 5 = 29, and 2 + 9 = 11, and 1 + 1 = 2, so the final single digit is 2.

### **Objective:**
- Learn how to repeatedly sum the digits of a number.
- Implement logic to reduce a number to its digit root.

## 🚀 Code Overview

This Java program:
1. Accepts a number from the user.
2. Repeatedly calculates the sum of its digits.
3. Continues the process until the result is a single digit.
4. Outputs the final single-digit result.

### **Concepts Covered:**
- Modulo and division operations to extract digits.
- Looping to sum digits.
- Efficiently reducing a number to a single digit.

## 📂 File Structure
- `Day 54/`
  - `SumOfDigits.java`: The main Java program to find the sum of digits until a single digit is left.
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
3. **Enter a number** to find the sum of its digits until a single digit is left.

## 🔍 Example Input/Output

```plaintext
Enter a number: 9875
The sum of digits until one digit is: 2

Enter a number: 1234
The sum of digits until one digit is: 1
```

---

**Day 54 complete!** On to Day 55!
