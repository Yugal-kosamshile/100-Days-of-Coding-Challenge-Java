# Day 82: Find the Difference between Two Dates

## 📝 Description

On Day 82 of my 100 Days of Code challenge, I created a program to calculate the difference between two dates. This Java program uses `LocalDate` to calculate the difference in days, months, and years between two dates provided as input.

### **Objective:**
- Learn to calculate date differences in Java.
- Practice using `Period` for date differences.

## 🚀 Code Overview

This Java program:
1. Parses two date strings into `LocalDate` objects.
2. Calculates the difference between the dates in terms of days, months, and years.
3. Outputs the difference in a user-friendly format.

### **Concepts Covered:**
- Parsing dates using `LocalDate`.
- Calculating the difference between dates using `Period`.

## 📂 File Structure
- `Day 82/`
  - `DateDifferenceCalculator.java`: Java program for calculating date differences.
  - `README.md`: This description file.

### Explanation:

1. **Parsing Dates**: Parses both date strings into `LocalDate` objects using `DateTimeFormatter`.
2. **Calculating Difference**: Uses `Period.between` to find the difference in years, months, and days between the two dates.
3. **Output**: Displays the difference in a readable format.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac DateDifferenceCalculator.java
   ```
2. **Run the program:**
   ```bash
   java DateDifferenceCalculator
   ```

## 🔍 Example Usage

- **Input Dates**: `2022-10-05` and `2024-10-05`
- **Output**: Difference is 2 years, 0 months, 0 days.

---

**Day 82 complete!** On to Day 83!
