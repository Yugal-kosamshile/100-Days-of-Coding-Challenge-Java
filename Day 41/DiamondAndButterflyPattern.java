
import java.util.Scanner;

public class DiamondAndButterflyPattern {

    // Method to print Diamond Pattern
    public static void printDiamondPattern(int numRows) {
        int n = numRows;

        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            // Printing leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Printing leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Method to print Butterfly Pattern
    public static void printButterflyPattern(int numRows) {
        int n = numRows;

        // Upper part of the butterfly
        for (int i = 1; i <= n; i++) {
            // Printing left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Printing spaces in between
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Printing right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the butterfly
        for (int i = n; i >= 1; i--) {
            // Printing left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Printing spaces in between
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Printing right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Main method to test both patterns
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of rows
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        // Print Diamond Pattern
        System.out.println("Diamond Pattern:");
        printDiamondPattern(numRows);

        // Print Butterfly Pattern
        System.out.println("\nButterfly Pattern:");
        printButterflyPattern(numRows);

        scanner.close();
    }
}
