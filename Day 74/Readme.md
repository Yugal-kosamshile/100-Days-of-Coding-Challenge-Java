# Day 74: Find the Lowest Common Ancestor in a BST

## 📝 Description

On Day 74 of my 100 Days of Code challenge, I implemented a function to find the Lowest Common Ancestor (LCA) in a Binary Search Tree (BST). The LCA of two nodes is the lowest node in the tree that has both nodes as descendants.

### **Objective:**
- Use BST properties to efficiently find the Lowest Common Ancestor.
- Implement an algorithm that leverages BST ordering to avoid traversing the entire tree.

## 🚀 Code Overview

This Java program:
1. Defines a `Node` class for each node in the BST.
2. Provides methods to add elements to the BST and to find the LCA of two nodes.

### **Concepts Covered:**
- Utilizing the properties of a BST to find common ancestors efficiently.
- Recursive and iterative approaches to navigating trees.

## 📂 File Structure
- `Day 74/`
  - `LowestCommonAncestorBST.java`: Java program to find the LCA of two nodes.
  - `README.md`: This description file.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac LowestCommonAncestorBST.java
   ```
2. **Run the program:**
   ```bash
   java LowestCommonAncestorBST
   ```

## 🔍 Example Output

```plaintext
Adding: 20
Adding: 10
Adding: 30
Adding: 5
Adding: 15
The LCA of 5 and 15 is: 10
The LCA of 10 and 30 is: 20
```

---

**Day 74 complete!** On to Day 75!
