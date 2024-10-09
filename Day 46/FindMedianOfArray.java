
import java.util.Arrays;
import java.util.Scanner;

public class FindMedianOfArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to hold the numbers
        int[] array = new int[n];

        // Ask the user to input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(array);

        // Calculate the median
        double median;
        if (n % 2 == 0) {
            // Even number of elements, median is the average of the two middle elements
            median = (array[n / 2 - 1] + array[n / 2]) / 2.0;
        } else {
            // Odd number of elements, median is the middle element
            median = array[n / 2];
        }

        // Output the median
        System.out.println("The median is: " + median);

        // Close the scanner
        scanner.close();
    }
}
