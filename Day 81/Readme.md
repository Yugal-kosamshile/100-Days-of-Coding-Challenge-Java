# Day 81: Convert between Time Zones

## 📝 Description

On Day 81 of my 100 Days of Code challenge, I implemented a Java program that converts a `ZonedDateTime` object between different time zones. This program takes a date and time in a specific time zone, converts it to another time zone, and displays the result.

### **Objective:**
- Learn to work with time zones using `ZonedDateTime`.
- Practice converting date and time between different time zones.

## 🚀 Code Overview

This Java program:
1. Parses a date and time string into a `ZonedDateTime` object in a specified time zone.
2. Converts it to another specified time zone.
3. Outputs the date and time in both the original and target time zones.

### **Concepts Covered:**
- `ZonedDateTime` for handling date and time with time zone information.
- Using `ZoneId` to specify time zones.
- Converting between time zones.

## 📂 File Structure
- `Day 81/`
  - `TimeZoneConverter.java`: Java program for time zone conversion.
  - `README.md`: This description file.

## 📋 How to Run
1. **Compile the program:**
   ```bash
   javac TimeZoneConverter.java
   ```
2. **Run the program:**
   ```bash
   java TimeZoneConverter
   ```

## 🔍 Example Usage

- **Input Date**: `2024-10-05T15:45:00`
- **Original Time Zone**: `America/New_York`
- **Target Time Zone**: `Europe/London`
- **Output**: Date and time in both time zones.

---

**Day 81 complete!** On to Day 82!
