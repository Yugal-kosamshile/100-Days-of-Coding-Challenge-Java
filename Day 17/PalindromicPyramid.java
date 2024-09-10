import java.util.Scanner;

public class PalindromicPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Calculate the maximum width of the pyramid
        int maxWidth = 2 * n - 1;

        for (int i = 1; i <= n; i++) {
            // Calculate the number of leading spaces
            int leadingSpaces = (maxWidth - (2 * i - 1)) / 2;

            // Print leading spaces for alignment
            for (int j = 1; j <= leadingSpaces; j++) {
                System.out.print(" ");
            }

            // Print decreasing sequence
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print increasing sequence
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            // Move to the next line
            System.out.println();
        }
        sc.close();
    }
}
