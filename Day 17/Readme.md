# Day 17: Pattern Programs

## 📝 Description

On Day 17 of my 100 Days of Code challenge, I explored additional pattern programs using various elements such as binary values, numbers, and stars. These programs further enhanced my understanding of how to manipulate loops and conditions to achieve complex outputs.

### **Objective:**
- Gain a deeper understanding of how to structure nested loops.
- Learn to generate more complex patterns using binary digits, numbers, and symbols.

## 🚀 Code Overview

### **1. Binary Triangle**
This program prints a triangle of alternating 1s and 0s. The first line starts with `1`, the next with `0`, and so on, with alternating values for each row.

```plaintext
1 
0 1 
1 0 1 
0 1 0 1 
```

- The program takes user input for the number of rows.
- Each row starts with `1` or `0` depending on whether the row number is odd or even.

### **2. Palindromic Pyramid**
This program prints a pyramid with numbers that create a palindrome in each row. The row starts with decreasing numbers and ends with increasing numbers.

```plaintext
    1
   212
  32123
 4321234
543212345
```

- The pyramid is centered by printing leading spaces.
- Each row prints decreasing numbers followed by increasing numbers.

### **3. Half Left Pyramid of Stars**
This program generates a left-aligned half pyramid of stars (`*`), where the number of stars in each row increases from 1 up to the input value.

```plaintext
   *
  **
 ***
****
```

- The number of stars increases in each row.
- Leading spaces are printed to align the stars to the right.

### **4. Number Pyramid**
This program prints a pyramid using numbers. Each row contains the same number as the row number, with spaces for alignment.

```plaintext
        1
      2   2
    3   3   3
  4   4   4   4
5   5   5   5   5
```

- Each row contains the row number printed multiple times.
- The pyramid is centered by adding spaces.

### **5. Centered Pyramid of Stars**
This program prints a centered pyramid of stars (`*`), where each row contains more stars than the previous one.

```plaintext
    *
   * *
  * * *
 * * * *
* * * * *
```

- The number of stars increases with each row.
- The stars are centered by adding leading spaces.

## 📂 File Structure
- `Day17/`
  - `binaryTriangle.java`: Prints a binary triangle.
  - `PalindromicPyramid.java`: Prints a centered palindromic number pyramid.
  - `halfLeftPyramid.java`: Prints a left-aligned half pyramid of stars.
  - `numberPyramid.java`: Prints a pyramid of numbers.
  - `centerPyramid.java`: Prints a centered pyramid of stars.
  - `README.md`: This description file.

## 📋 How to Run
1. **Compile any program:**
   ```bash
   javac <ProgramName>.java
   ```
2. **Run the program:**
   ```bash
   java <ProgramName>
   ```

   Example:
   ```bash
   javac binaryTriangle.java
   java binaryTriangle
   ```

3. **For user input-based programs**, follow the prompt to enter the number of rows.

## 🔍 Example Output

### **Binary Triangle:**
```plaintext
Enter the number of rows: 4
1 
0 1 
1 0 1 
0 1 0 1 
```

### **Palindromic Pyramid:**
```plaintext
Enter the number of rows: 5
    1
   212
  32123
 4321234
543212345
```

### **Half Left Pyramid:**
```plaintext
Enter the number of lines: 4
   *
  **
 ***
****
```

### **Number Pyramid:**
```plaintext
Enter the number of lines: 5
        1
      2   2
    3   3   3
  4   4   4   4
5   5   5   5   5
```

### **Centered Pyramid of Stars:**
```plaintext
Enter the number of lines: 5
    *
   * *
  * * *
 * * * *
* * * * *
```

---

**Day 17 complete!** On to Day 18!
