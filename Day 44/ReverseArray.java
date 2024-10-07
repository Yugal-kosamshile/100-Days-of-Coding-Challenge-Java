import java.util.Scanner;

public class ReverseArray {

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

        // Reverse the array in place
        int start = 0;
        int end = n - 1;
        while (start < end) {
            // Swap the elements at start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move start forward and end backward
            start++;
            end--;
        }

        // Output the reversed array
        System.out.println("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
