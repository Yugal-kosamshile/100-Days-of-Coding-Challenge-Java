# Day 72: Find the Height of a BST

## 📝 Description

On Day 72 of my 100 Days of Code challenge, I implemented a function to calculate the height of a Binary Search Tree (BST). The height of a tree is the number of edges from the root to the deepest leaf.

### **Objective:**
- Implement a recursive function to calculate the height of a BST.
- Practice tree traversal and recursive depth calculations.

## 🚀 Code Overview

This Java program:
1. Defines a `Node` class to represent each node in the BST.
2. Provides methods to add elements and calculate the height of the tree.

### **Concepts Covered:**
- Recursive depth calculation.
- Basic tree structure operations.

## 📂 File Structure
- `Day 72/`
  - `BinarySearchTreeHeight.java`: The Java program to find the height of a BST.
  - `README.md`: This description file.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac BinarySearchTreeHeight.java
   ```
2. **Run the program:**
   ```bash
   java BinarySearchTreeHeight
   ```

## 🔍 Example Output

```plaintext
Adding: 10
Adding: 5
Adding: 15
Adding: 7
Height of the BST: 2
```
### Explanation:

1. **add Method**: Inserts values into the BST, maintaining the binary search property.
2. **getHeight Method**: Calculates the height by recursively checking the left and right subtrees.
3. **findHeight Method**: Uses recursion to find the maximum depth by comparing left and right subtree heights.
---

**Day 72 complete!** On to Day 73!
