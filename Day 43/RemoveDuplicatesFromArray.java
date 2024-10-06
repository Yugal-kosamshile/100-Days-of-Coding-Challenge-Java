
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromArray {

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

        // Create a set to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();

        // Traverse the array and add elements to the set (automatically removes duplicates)
        for (int i = 0; i < n; i++) {
            uniqueElements.add(array[i]);
        }

        // Output the unique elements
        System.out.println("Array after removing duplicates: ");
        for (int element : uniqueElements) {
            System.out.print(element + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
