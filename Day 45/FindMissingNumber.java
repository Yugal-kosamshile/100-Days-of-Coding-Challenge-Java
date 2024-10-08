
import java.util.Scanner;

public class FindMissingNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        // Create an array to hold n-1 numbers
        int[] array = new int[n - 1];

        // Ask the user to input the elements of the array
        System.out.println("Enter the elements of the array (from 1 to " + n + ", with one missing): ");
        for (int i = 0; i < n - 1; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of the first n natural numbers
        int totalSum = n * (n + 1) / 2;

        // Calculate the sum of the elements in the array
        int arraySum = 0;
        for (int i = 0; i < n - 1; i++) {
            arraySum += array[i];
        }

        // The missing number is the difference between totalSum and arraySum
        int missingNumber = totalSum - arraySum;

        // Output the missing number
        System.out.println("The missing number is: " + missingNumber);

        // Close the scanner
        scanner.close();
    }
}
