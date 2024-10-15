import java.util.Scanner;

public class SecondLargestInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Handle cases where there are fewer than two elements
        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        // Create an array to hold the numbers
        int[] array = new int[n];

        // Ask the user to input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the largest and second largest numbers
        findSecondLargest(array);

        // Close the scanner
        scanner.close();
    }

    // Function to find the second largest number
    public static void findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array to find the largest and second largest
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        // Output the result
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number in the array.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }
}
