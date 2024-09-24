import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Prompt the user to enter the number of random numbers to generate
        System.out.print("Enter the number of random numbers to generate: ");
        int n = scanner.nextInt();

        // Initialize an array to hold the random numbers
        int[] numbers = new int[n];

        // Generate random numbers and store them in the array
        System.out.print("Generated random numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(100); // Random numbers between 0 and 99
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Sort the array
        Arrays.sort(numbers);

        // Output the sorted numbers
        System.out.print("Sorted numbers: ");
        System.out.println(Arrays.toString(numbers));
    }
}
