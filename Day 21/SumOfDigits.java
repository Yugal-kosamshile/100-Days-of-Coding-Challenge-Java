import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking input number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;

        // Loop to calculate sum of digits
        while (number != 0) {
            // Extracting the last digit
            int digit = number % 10;
            // Adding the digit to the sum
            sum += digit;
            // Removing the last digit
            number /= 10;
        }

        // Displaying the result
        System.out.println("Sum of digits: " + sum);

        // Close the scanner
        sc.close();
    }
}
