# Day 40: Print Pascal’s Triangle

## 📝 Description

On Day 40 of my 100 Days of Code challenge, I implemented a program in Java to generate and print **Pascal’s Triangle**. Pascal's Triangle is a triangular array of numbers where each number is the sum of the two directly above it. It's a classic problem to understand combinatorics and dynamic programming concepts.

### **Objective:**
- Learn how to generate Pascal’s Triangle.
- Understand recursive relationships in mathematical structures.
- Practice working with arrays and loops in Java.

## 🚀 Code Overview

This Java program:
1. Takes the number of rows as input.
2. Generates Pascal's Triangle up to the specified number of rows.
3. Prints the triangle in a formatted manner.

### **Pascal's Triangle Explanation:**
- Pascal's Triangle is a triangular array where the outermost values are always `1`, and each inner value is the sum of the two values directly above it.
- The value in row `r` and column `c` of Pascal's Triangle is calculated as:
  \[
  \text{Pascal}(r, c) = \binom{r}{c} = \frac{r!}{c!(r-c)!}
  \]
- The first row of the triangle corresponds to row 0, with a single element 1. Each subsequent row builds upon the previous row.

### **Concepts Covered:**
- Nested loops for generating and printing Pascal’s Triangle.
- Array manipulation and indexing.
- Handling combinatoric calculations using iterative methods.

## 📂 File Structure
- `Day 40/`
  - `PascalsTriangle.java`: The main Java program.
  - `README.md`: This description file.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac PascalsTriangle.java
   ```
2. **Run the program:**
   ```bash
   java PascalsTriangle
   ```
3. Enter the number of rows for Pascal's Triangle, and the program will generate and print it.

## 🔍 Example Output

For 5 rows of Pascal’s Triangle:

```plaintext
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1

Day 40 Complete! On to Day 41.
