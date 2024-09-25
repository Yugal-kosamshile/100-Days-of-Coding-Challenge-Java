import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array and allow the user to input the elements
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Prompt the user to enter the target value to search for
        System.out.print("Enter the target value to search for: ");
        int target = scanner.nextInt();

        // Perform linear search
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println(target + " found at index " + i);
                found = true;
                break;
            }
        }

        // If the target is not found
        if (!found) {
            System.out.println(target + " not found in the array.");
        }
        scanner.close();
    }
}
