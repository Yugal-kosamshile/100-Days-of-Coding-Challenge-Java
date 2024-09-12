import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Check if the number of terms is valid
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci Sequence:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + (i < n - 1 ? ", " : "\n"));
            }
        }
    }

    // Method to calculate Fibonacci number using recursion
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
