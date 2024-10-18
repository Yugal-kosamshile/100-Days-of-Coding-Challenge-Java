
import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Get the number of digits
        int digitCount = countDigits(number);

        // Output the result
        System.out.println("The number of digits is: " + digitCount);

        // Close the scanner
        scanner.close();
    }

    // Function to count the number of digits in a number
    public static int countDigits(int number) {
        // Convert negative numbers to positive
        number = Math.abs(number);

        // Special case for number 0
        if (number == 0) {
            return 1;
        }

        int count = 0;

        // Count digits by repeatedly dividing the number by 10
        while (number > 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}
