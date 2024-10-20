import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Check if the number is non-negative
        if (number < 0) {
            System.out.println("Square root of negative numbers is not real.");
        } else {
            // Calculate the square root using Math.sqrt()
            double result = Math.sqrt(number);
            System.out.println("The square root of " + number + " is: " + result);
        }

        // Close the scanner
        scanner.close();
    }
}
