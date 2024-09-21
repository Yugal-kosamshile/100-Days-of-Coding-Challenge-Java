import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the number of random numbers to generate
        System.out.print("Enter the number of random numbers to generate: ");
        int n = sc.nextInt();

        int[] randomNumbers = new int[n];
        Random rand = new Random();

        // Generate random numbers and store them in the array
        for (int i = 0; i < n; i++) {
            randomNumbers[i] = rand.nextInt(100); // Generates random number between 0-99
        }

        // Print the random numbers
        System.out.println("Random numbers: " + Arrays.toString(randomNumbers));

        // Sort the numbers
        Arrays.sort(randomNumbers);

        // Print the sorted numbers
        System.out.println("Sorted numbers: " + Arrays.toString(randomNumbers));

        sc.close();
    }
}
