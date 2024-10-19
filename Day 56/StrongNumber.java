import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a Strong Number
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong Number.");
        } else {
            System.out.println(number + " is not a Strong Number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if a number is a Strong Number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        // Calculate the sum of the factorials of each digit
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        // Check if the sum equals the original number
        return sum == originalNumber;
    }

    // Function to calculate the factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }
}
