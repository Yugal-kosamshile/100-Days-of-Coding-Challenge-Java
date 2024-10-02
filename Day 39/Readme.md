# Day 39: Insertion Sort Algorithm

## 📝 Description

On Day 39 of my 100 Days of Code challenge, I implemented the **Insertion Sort** algorithm in Java. This sorting algorithm builds the final sorted array one element at a time by repeatedly taking an unsorted element and inserting it into its correct position within the sorted portion of the array.

### **Objective:**
- Learn how to implement the Insertion Sort algorithm.
- Understand how to insert elements into a sorted subarray.
- Practice array manipulation and shifting elements.

## 🚀 Code Overview

This Java program:
1. Takes an unsorted array of integers.
2. Implements the Insertion Sort algorithm to sort the array in ascending order.
3. Outputs the sorted array.

### **Algorithm Explanation:**
- Insertion Sort works by dividing the array into a sorted and an unsorted part.
- It starts with the first element as a sorted subarray.
- For each unsorted element, it is compared with the elements in the sorted part and inserted at its correct position by shifting larger elements to the right.
- This process continues until the entire array is sorted.

### **Concepts Covered:**
- Sorting by insertion into a sorted subarray.
- Shifting elements to make room for the current element.
- Nested loops and conditionals in sorting algorithms.

## 📂 File Structure
- `Day 39/`
  - `InsertionSort.java`: The main Java program.
  - `README.md`: This description file.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac InsertionSort.java
   ```
2. **Run the program:**
   ```bash
   java InsertionSort
   ```
3. The program will sort the array and display both the original and sorted arrays.

## 🔍 Example Output

```plaintext
Original Array: [64, 25, 12, 22, 11]
Sorted Array: [11, 12, 22, 25, 64]
```

## 🛠️ Time Complexity
- **Worst and Average Case Complexity:** O(n²) due to the nested loops.
- **Best Case Complexity:** O(n) when the array is already sorted.
- **Space Complexity:** O(1) since the sorting is done in place.

---

**Day 39 complete!** Looking forward to more sorting algorithms and understanding their trade-offs and optimizations.
