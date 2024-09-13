import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input string from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step 1: Remove spaces
        String noSpaces = input.replace(" ", "");

        // Step 2: Convert to lowercase
        String formattedInput = noSpaces.toLowerCase();

        // Reversing the string
        String reversed = new StringBuilder(formattedInput).reverse().toString();

        // Checking if the string is a palindrome
        if (formattedInput.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
