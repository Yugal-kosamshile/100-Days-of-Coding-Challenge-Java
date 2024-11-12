import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateParser {
    public static void main(String[] args) {
        String dateTimeStr = "2024-10-05T15:45:00";
        
        // Define a formatter to parse the ISO_LOCAL_DATE_TIME format
        DateTimeFormatter inputFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        DateTimeFormatter outputFormatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
        DateTimeFormatter outputFormatter2 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss");

        try {
            // Parse the input date-time string
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, inputFormatter);

            // Print the parsed date in different formats
            System.out.println("Original Date-Time: " + dateTimeStr);
            System.out.println("Formatted (MM/dd/yyyy hh:mm a): " + dateTime.format(outputFormatter1));
            System.out.println("Formatted (EEEE, MMMM dd, yyyy HH:mm:ss): " + dateTime.format(outputFormatter2));
            
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date-time format! Please check the input string.");
        }
    }
}
