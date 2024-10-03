
import java.util.Scanner;

public class PascalsTriangle {

    // Method to generate and print Pascal's Triangle
    public static void printPascalsTriangle(int numRows) {
        int[][] triangle = new int[numRows][numRows];

        // Generate Pascal's Triangle
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                // The first and last values in each row are always 1
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    // Each number is the sum of the two numbers directly above it
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();  // Newline after each row
        }
    }

    // Main method to take input and call printPascalsTriangle
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of rows
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();

        // Print Pascal's Triangle
        System.out.println("Pascal's Triangle:");
        printPascalsTriangle(numRows);

        scanner.close();
    }
}
