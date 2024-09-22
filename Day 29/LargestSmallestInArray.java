import java.util.Scanner;

public class LargestSmallestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        // Input the array elements from the user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Initialize largest and smallest with the first element
        int largest = numbers[0];
        int smallest = numbers[0];

        // Loop through the array to find the largest and smallest elements
        for (int i = 1; i < n; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        // Print the largest and smallest numbers
        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);

        sc.close();
    }
}
