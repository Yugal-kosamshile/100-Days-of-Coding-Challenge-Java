import java.util.Scanner;

public class CountCharacterOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Ask the user to enter the character to count
        System.out.print("Enter the character to count: ");
        char characterToCount = scanner.next().charAt(0);

        // Initialize the count variable
        int count = 0;

        // Traverse the string and count the occurrences of the character
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == characterToCount) {
                count++;
            }
        }

        // Output the result
        System.out.println("The character '" + characterToCount + "' appears " + count + " time(s) in the string.");

        // Close the scanner
        scanner.close();
    }
} 
