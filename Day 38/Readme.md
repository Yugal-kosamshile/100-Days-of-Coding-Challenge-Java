# Day 38: Selection Sort Algorithm

## 📝 Description

On Day 38 of my 100 Days of Code challenge, I implemented the **Selection Sort** algorithm in Java, another simple sorting algorithm that works by repeatedly finding the minimum element from the unsorted part of the array and swapping it with the first unsorted element.

### **Objective:**
- Learn how to implement the Selection Sort algorithm.
- Understand another basic sorting technique in Java.
- Practice selecting and swapping elements in arrays.

## 🚀 Code Overview

This Java program:
1. Takes an unsorted array of integers.
2. Implements the Selection Sort algorithm to sort the array in ascending order.
3. Outputs the sorted array.

### **Algorithm Explanation:**
- Selection Sort divides the array into two parts: the sorted part and the unsorted part.
- During each iteration, it selects the smallest element from the unsorted part and swaps it with the first unsorted element.
- The algorithm moves the boundary between the sorted and unsorted parts until the entire array is sorted.

### **Concepts Covered:**
- Array traversal using loops.
- Element comparison and selection.
- Swapping elements.
- Sorting algorithms and their time complexity.

## 📂 File Structure
- `Day 38/`
  - `SelectionSort.java`: The main Java program.
  - `README.md`: This description file.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac SelectionSort.java
   ```
2. **Run the program:**
   ```bash
   java SelectionSort
   ```
3. The program will sort the array and display both the original and sorted arrays.

## 🔍 Example Output

```plaintext
Original Array: [64, 25, 12, 22, 11]
Sorted Array: [11, 12, 22, 25, 64]
```

## 🛠️ Time Complexity
- **Worst and Average Case Complexity:** O(n²) due to the use of nested loops.
- **Space Complexity:** O(1) since the algorithm performs sorting in place.

---

**Day 38 complete!** Excited to keep improving my understanding of sorting algorithms as I progress through the challenge.
