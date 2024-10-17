import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the sum of digits until one digit remains
        int result = sumOfDigitsUntilOne(number);

        // Output the result
        System.out.println("The sum of digits until one digit is: " + result);

        // Close the scanner
        scanner.close();
    }

    // Function to find the sum of digits until one digit is left
    public static int sumOfDigitsUntilOne(int number) {
        // Repeat the process until the number is reduced to a single digit
        while (number >= 10) {
            number = sumOfDigits(number);
        }
        return number;
    }

    // Function to sum the digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;

        // Extract each digit and add to the sum
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
