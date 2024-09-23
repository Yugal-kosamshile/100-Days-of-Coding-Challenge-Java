import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Calculate the sum of natural numbers
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Output the result
        System.out.println("The sum of natural numbers up to " + n + " is: " + sum);
    scanner.close();
    }
}
