import java.util.Scanner;

public class LargestPrimeFactor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Find the largest prime factor
        long largestPrimeFactor = findLargestPrimeFactor(number);

        // Output the result
        System.out.println("The largest prime factor is: " + largestPrimeFactor);

        // Close the scanner
        scanner.close();
    }

    // Function to find the largest prime factor
    public static long findLargestPrimeFactor(long number) {
        long largestFactor = -1;

        // Divide the number by 2 until it's odd
        while (number % 2 == 0) {
            largestFactor = 2;
            number /= 2;
        }

        // Check for odd factors
        for (long i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestFactor = i;
                number /= i;
            }
        }

        // If the number itself is prime and greater than 2
        if (number > 2) {
            largestFactor = number;
        }

        return largestFactor;
    }
}
