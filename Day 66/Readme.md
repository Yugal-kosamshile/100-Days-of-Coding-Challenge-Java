# Day 66: Detect a Cycle in a Linked List

## 📝 Description

On Day 66 of my 100 Days of Code challenge, I implemented a method to detect cycles in a linked list. A cycle occurs when a node in a linked list points back to a previous node, creating a loop. The most common approach to detect a cycle is by using the **Floyd’s Cycle Detection Algorithm** (also known as the tortoise and hare algorithm), which uses two pointers moving at different speeds.

### **Objective:**
- Identify and implement a method to detect cycles in a linked list.
- Practice using Floyd’s Cycle Detection Algorithm.

## 🚀 Code Overview

This Java program:
1. Defines a `Node` class representing each element in the linked list.
2. Implements methods to add nodes and check for cycles using Floyd's Cycle Detection Algorithm.
3. Uses two pointers, `slow` and `fast`, which traverse the list at different speeds to detect any cycle.

### **Concepts Covered:**
- Cycle detection in linked lists.
- Floyd’s Cycle Detection Algorithm (tortoise and hare).

## 📂 File Structure
- `Day 66/`
  - `CycleDetectionLinkedList.java`: Main Java program to detect a cycle in a linked list.
  - `README.md`: This description file.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac CycleDetectionLinkedList.java
   ```
2. **Run the program:**
   ```bash
   java CycleDetectionLinkedList
   ```

## 🔍 Example Output

```plaintext
Adding 10
Adding 20
Adding 30
Adding 40
Cycle detected: false
Creating a cycle
Cycle detected: true
```

---

**Day 66 complete!** On to Day 67!
