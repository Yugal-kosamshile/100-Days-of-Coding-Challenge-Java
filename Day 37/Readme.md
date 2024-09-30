# Day 37: Bubble Sort Algorithm

## 📝 Description

On Day 37 of my 100 Days of Code challenge, I implemented the **Bubble Sort** algorithm in Java, a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

### **Objective:**
- Learn how to implement the Bubble Sort algorithm.
- Understand basic sorting techniques in Java.
- Practice array manipulation and swapping elements.

## 🚀 Code Overview

This Java program:
1. Takes an unsorted array of integers.
2. Implements the Bubble Sort algorithm to sort the array in ascending order.
3. Outputs the sorted array.

### **Algorithm Explanation:**
- Bubble Sort works by repeatedly stepping through the array and comparing adjacent elements.
- If two adjacent elements are in the wrong order, they are swapped.
- This process repeats for all elements, with each pass "bubbling" the largest unsorted element to its correct position.
- The algorithm stops once the array is fully sorted.

### **Concepts Covered:**
- Array manipulation.
- Nested loops for sorting.
- Conditional statements for swapping.
- Optimizing the algorithm by stopping early if no swaps are made in a pass.

## 📂 File Structure
- `Day 37/`
  - `BubbleSort.java`: The main Java program.
  - `README.md`: This description file.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac BubbleSort.java
   ```
2. **Run the program:**
   ```bash
   java BubbleSort
   ```
3. The program will sort the array and display both the original and sorted arrays.

## 🔍 Example Output

```plaintext
Original Array: [64, 34, 25, 12, 22, 11, 90]
Sorted Array: [11, 12, 22, 25, 34, 64, 90]
```

## 🛠️ Optimizations
- **Early termination:** The program can stop early if no swaps are made during a pass, meaning the array is already sorted.
- **Time complexity:** Bubble Sort has a time complexity of O(n^2) in the worst and average cases, but can be optimized in practice for nearly sorted arrays.

---

**Day 37 complete!** Looking forward to tackling more algorithms in the coming days!
