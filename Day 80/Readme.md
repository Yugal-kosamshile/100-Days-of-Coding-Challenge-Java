# Day 80: Parse a Date and Time

## 📝 Description

On Day 80 of my 100 Days of Code challenge, I worked on parsing and formatting date and time in Java. This program demonstrates how to parse a date and time string into a `LocalDateTime` object and how to format a `LocalDateTime` object into a custom string.

### **Objective:**
- Learn to parse date and time strings into Java date objects.
- Practice formatting `LocalDateTime` objects into custom date and time formats.

## 🚀 Code Overview

This Java program:
1. Parses a date and time string into a `LocalDateTime` object.
2. Outputs the parsed date in a formatted string.
3. Demonstrates how to handle different date formats.

### **Concepts Covered:**
- Parsing strings to dates using `DateTimeFormatter`.
- Formatting date and time objects.
- Handling different date-time formats and patterns.

## 📂 File Structure
- `Day 80/`
  - `DateParser.java`: Java program for parsing and formatting date and time.
  - `README.md`: This description file.

### Explanation:

1. **Parsing**: Uses `LocalDateTime.parse` with `DateTimeFormatter.ISO_LOCAL_DATE_TIME` to parse a standard ISO date format (`yyyy-MM-dd'T'HH:mm:ss`).
2. **Formatting**: Defines custom output formats:
   - `"MM/dd/yyyy hh:mm a"` shows the date in month/day/year format with 12-hour time.
   - `"EEEE, MMMM dd, yyyy HH:mm:ss"` shows the date in a verbose format with 24-hour time.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac DateParser.java
   ```
2. **Run the program:**
   ```bash
   java DateParser
   ```

## 🔍 Example Usage

- **Input Date**: `2024-10-05T15:45:00`
- **Parsed Output**: Date in various formats like `MM/dd/yyyy hh:mm a` or `EEEE, MMMM dd, yyyy HH:mm:ss`.

---

**Day 80 complete!** On to Day 81!
