import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class DateDifferenceCalculator {
    public static void main(String[] args) {
        String dateStr1 = "2022-10-05";
        String dateStr2 = "2024-10-05";
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            // Parse the input date strings
            LocalDate date1 = LocalDate.parse(dateStr1, formatter);
            LocalDate date2 = LocalDate.parse(dateStr2, formatter);

            // Calculate the period between the two dates
            Period difference = Period.between(date1, date2);

            // Output the difference in years, months, and days
            System.out.println("Difference between dates:");
            System.out.println(difference.getYears() + " years, " +
                               difference.getMonths() + " months, " +
                               difference.getDays() + " days");
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format! Please use the format yyyy-MM-dd.");
        }
    }
}
