# Day 83: Bank Account Management System

## 📝 Description

On Day 83 of my 100 Days of Code challenge, I implemented a simple Bank Account Management System. This Java program simulates basic banking operations such as deposit, withdrawal, and balance checking for a single user account.

### **Objective:**
- Learn how to implement object-oriented concepts in Java (such as classes and methods).
- Simulate basic banking operations like deposit, withdraw, and balance check.

## 🚀 Code Overview

This Java program:
1. Implements a `BankAccount` class that represents a user's account.
2. Allows users to perform basic operations like deposit, withdraw, and check their balance.
3. Validates input to ensure that invalid operations (like withdrawing more than the balance) are prevented.

### **Concepts Covered:**
- Object-oriented programming (OOP) concepts: classes and methods.
- Input validation.
- Basic user interaction via the console.

## 📂 File Structure
- `Day 83/`
  - `BankAccount.java`: Java class to simulate the bank account.
  - `README.md`: This description file.

### Explanation:

1. **BankAccount Class**: 
   - Contains a `balance` field to store the user's balance.
   - `deposit(double amount)`: Adds the deposit amount to the balance.
   - `withdraw(double amount)`: Subtracts the withdrawal amount from the balance, ensuring there is enough balance.
   - `checkBalance()`: Displays the current balance.

2. **Main Method**:
   - Prompts the user for different banking operations (deposit, withdraw, check balance, or exit).
   - Uses a `Scanner` to receive user input and perform the chosen operations.

3. **Input Validation**:
   - Ensures that deposits and withdrawals are positive amounts.
   - Prevents withdrawals that exceed the current balance.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac BankAccount.java
   ```
2. **Run the program:**
   ```bash
   java BankAccount
   ```

## 🔍 Example Usage

- **Operations**: Deposit $100, Withdraw $50, Check Balance.
- **Output**: 
  ```
  Balance after deposit: $100
  Balance after withdrawal: $50
  Current balance: $50
  ```

---

**Day 83 complete!** On to Day 84!
