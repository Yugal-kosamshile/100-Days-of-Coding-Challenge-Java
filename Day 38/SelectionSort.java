public class SelectionSort {

    // Method to implement Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse the unsorted array
        for (int i = 0; i < n - 1; i++) {
            // Assume the first unsorted element is the smallest
            int minIndex = i;

            // Find the minimum element in the remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main method to test the Selection Sort implementation
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(arr);

        // Sorting the array using Selection Sort
        selectionSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
