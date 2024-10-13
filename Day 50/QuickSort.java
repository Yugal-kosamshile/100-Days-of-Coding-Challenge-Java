import java.util.Scanner;

public class QuickSort {

    // Main function to run the quick sort
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

        // Call the quickSort function to sort the array
        quickSort(array, 0, array.length - 1);

        // Output the sorted array
        System.out.println("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }

    // Quick Sort function (recursive)
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find the pivot element
            int pivotIndex = partition(array, low, high);

            // Recursively sort the elements before and after partition
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Function to partition the array
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Pivot element is chosen as the last element
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and array[high] (the pivot element)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // Return the partition point
    }
}
