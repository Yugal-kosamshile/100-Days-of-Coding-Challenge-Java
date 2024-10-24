# Day 61: Implement a Stack Using Arrays

## 📝 Description

On Day 61 of my 100 Days of Code challenge, I implemented a **Stack** data structure using arrays in Java. A stack is a linear data structure that follows the **Last In First Out (LIFO)** principle. The most recent element added to the stack is the first one to be removed.

### **Objective:**
- Learn how to implement a stack using arrays.
- Understand how to perform basic stack operations like `push`, `pop`, `peek`, and checking if the stack is empty or full.

### How it Works:

1. **Array-Based Stack**: This implementation uses an integer array to hold the stack elements and a `top` pointer to keep track of the stack's current position.
2. **Push Operation**: Adds an element to the stack by incrementing the `top` pointer and inserting the value at that position. It checks if the stack is full before adding.
3. **Pop Operation**: Removes the top element from the stack and decrements the `top` pointer. It checks if the stack is empty before removing.
4. **Peek Operation**: Returns the top element without removing it from the stack.
5. **Boundary Conditions**: The program checks for stack overflow (when the stack is full) and stack underflow (when the stack is empty) and handles these cases gracefully.

## 🚀 Code Overview

This Java program:
1. Implements a stack data structure using a fixed-size array.
2. Provides operations such as `push()` to add an element, `pop()` to remove an element, `peek()` to view the top element, and methods to check if the stack is full or empty.

### **Concepts Covered:**
- Stack operations: `push()`, `pop()`, `peek()`, `isEmpty()`, and `isFull()`.
- Array-based implementation of stacks.
- Handling stack overflow and underflow conditions.

## 📂 File Structure
- `Day 61/`
  - `StackUsingArray.java`: The main Java program to implement a stack using arrays.
  - `README.md`: This description file.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac StackUsingArray.java
   ```
2. **Run the program:**
   ```bash
   java StackUsingArray
   ```

## 🔍 Example Input/Output

```plaintext
Pushing 10 onto the stack.
Pushing 20 onto the stack.
Pushing 30 onto the stack.

Top element is: 30
Popped element is: 30
Top element after pop: 20

Pushing 40 onto the stack.
Top element is: 40
```

---

**Day 61 complete!** On to Day 62!
