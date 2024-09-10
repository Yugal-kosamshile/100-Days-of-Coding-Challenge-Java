# Day 16: Pattern Programs 

## 📝 Description

On Day 16 of my 100 Days of Code challenge, I wrote several Java programs to generate different patterns using characters, numbers, and stars. Pattern programming is a great way to practice loops and understand how to manipulate nested iterations.

### **Objective:**
- Learn how to generate different patterns using nested loops.
- Explore a variety of patterns using characters, numbers, and symbols.

## 🚀 Code Overview

### **1. Character Increment Pattern**
This program prints a right-aligned triangle pattern using letters. Each subsequent row starts from where the previous one left off.

```plaintext
A
BC
DEF
GHIJ
```

- The program initializes `char ch = 'A'` and increments it after printing each character.
- The number of characters increases with each row.

### **2. Digit Half Pyramid**
This program generates a half pyramid using digits where the number of digits in each row matches the row number.

```plaintext
1
12
123
1234
...
```

- The program takes user input for the number of rows.
- It prints digits incrementally up to the current row number.

### **3. Half Right Pyramid of Stars**
This program prints a right-angled triangle using stars (`*`), where each row contains one more star than the previous one.

```plaintext
 *
 * *
 * * *
 * * * *
...
```

- It uses a fixed value of 10 rows, but this can be modified as per the requirement.

### **4. Inverted Star Pyramid**
This program prints an inverted triangle pattern using stars (`*`), decreasing the number of stars in each subsequent row.

```plaintext
 * * * * *
 * * * *
 * * *
 * *
 *
```

- The program takes user input for the number of rows.
- The number of stars starts from the input value and decreases with each row.

## 📂 File Structure
- `Day16/`
  - `charPattern.java`: Prints the character triangle pattern.
  - `digitHalfPyramid.java`: Prints the half pyramid of digits.
  - `halfRightPyramid.java`: Prints the right-aligned star pyramid.
  - `invertedStar.java`: Prints the inverted star pyramid.
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
   javac charPattern.java
   java charPattern
   ```

3. **For user input-based programs**, follow the prompt to enter the number of rows.

## 🔍 Example Output

### **Character Pattern:**
```plaintext
A
BC
DEF
GHIJ
```

### **Digit Half Pyramid:**
```plaintext
Enter the number of lines: 4
1
12
123
1234
```

### **Half Right Pyramid:**
```plaintext
 *
 * *
 * * *
 * * * *
```

### **Inverted Star Pyramid:**
```plaintext
Enter the number of lines: 5
 * * * * *
 * * * *
 * * *
 * *
 *
```

---

**Day 16 complete!** On to Day 17!
