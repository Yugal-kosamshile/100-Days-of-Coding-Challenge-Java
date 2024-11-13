
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;

public class TimeZoneConverter {
    public static void main(String[] args) {
        String dateTimeStr = "2024-10-05T15:45:00";
        String originalZone = "America/New_York";
        String targetZone = "Europe/London";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

        try {
            // Parse the date-time string with the original time zone
            ZonedDateTime originalDateTime = ZonedDateTime.parse(dateTimeStr + "[" + originalZone + "]", formatter.withZone(ZoneId.of(originalZone)));

            // Convert to target time zone
            ZonedDateTime targetDateTime = originalDateTime.withZoneSameInstant(ZoneId.of(targetZone));

            // Display original and converted date-time
            System.out.println("Original Date-Time (" + originalZone + "): " + originalDateTime);
            System.out.println("Converted Date-Time (" + targetZone + "): " + targetDateTime);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date-time format! Please check the input.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
