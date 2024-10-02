public class InsertionSort {

    // Method to implement Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Traverse through the unsorted array starting from the second element
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // The element to be inserted
            int j = i - 1;

            // Shift elements of the sorted part that are greater than 'key'
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // Shift element to the right
                j = j - 1;
            }
            // Insert 'key' at the correct position
            arr[j + 1] = key;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main method to test the Insertion Sort implementation
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(arr);

        // Sorting the array using Insertion Sort
        insertionSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
