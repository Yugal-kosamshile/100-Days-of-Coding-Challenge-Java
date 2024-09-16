
import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking input string from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Initialize counts
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert string to lowercase for case-insensitive comparison
        String formattedInput = input.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < formattedInput.length(); i++) {
            char ch = formattedInput.charAt(i);

            // Check if character is a letter
            if (Character.isLetter(ch)) {
                // Check if character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Displaying the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        // Close the scanner
        sc.close();
    }
}