import java.util.Scanner;

public class LargestAndSmallestInArray {

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

        // Initialize largest and smallest values to the first element
        int largest = array[0];
        int smallest = array[0];

        // Traverse the array to find the largest and smallest elements
        for (int i = 1; i < n; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Output the results
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        // Close the scanner
        scanner.close();
    }
}
