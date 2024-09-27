import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array and allow the user to input the elements (assumed sorted)
        int[] arr = new int[n];
        System.out.println("Enter the elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Prompt the user to enter the target value to search for
        System.out.print("Enter the target value to search for: ");
        int target = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(arr, target);

        // Output the result
        if (result == -1) {
            System.out.println(target + " not found in the array.");
        } else {
            System.out.println(target + " found at index " + result);
        }
        scanner.close();
    }

    // Method to perform binary search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If the target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            } 
            // If the target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Target not found
        return -1;
    }
}
