# Day 79: Implement a Basic Game (Tic-Tac-Toe)

## 📝 Description

On Day 79 of my 100 Days of Code challenge, I developed a simple Tic-Tac-Toe game using Java Swing for the graphical interface. This game allows two players to play on a 3x3 grid, aiming to get three of their marks (X or O) in a row to win.

### **Objective:**
- Build a fully interactive Tic-Tac-Toe game with GUI.
- Practice event handling and GUI updates.

## 🚀 Code Overview

This Java program:
1. Creates a 3x3 grid of buttons representing the Tic-Tac-Toe board.
2. Alternates between two players (X and O).
3. Checks for a win or draw after each move.

### **Concepts Covered:**
- Java Swing for interactive GUI elements.
- Event handling for button clicks.
- Game logic for turn-taking and win conditions.

## 📂 File Structure
- `Day 79/`
  - `TicTacToeGame.java`: Java program for the Tic-Tac-Toe game.
  - `README.md`: This description file.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac TicTacToeGame.java
   ```
2. **Run the program:**
   ```bash
   java TicTacToeGame
   ```

 ## Explanation:

1. **GUI Setup**: Uses a `JButton` grid for the board and sets 
up click events for each button.
2. **Turn Alternation**: `isXTurn` toggles after each move.
3. **Win and Draw Checks**: The `checkWin` method checks rows, columns, and 
diagonals for three matching marks, while `isDraw` checks if all cells are filled.
4. **Reset Game**: Resets the board and prepares for a new game if a win or draw occurs.

## 🔍 Example Usage

- **Gameplay**: Players alternate turns, clicking on buttons to place their mark (X or O). The game declares a winner or a draw once conditions are met.
- **Win Condition**: Three marks in a row, column, or diagonal.
- **Draw Condition**: No winner after all spaces are filled.

---

**Day 79 complete!** On to Day 80!
