import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = sc.next();
        
        String rev = "";  // Initialize an empty string for the reversed string

        // Loop to reverse the string
        for (int i = string.length() - 1; i >= 0; i--) {
            rev = rev + string.charAt(i);  // Append each character in reverse order
        }

        System.out.println("Reversed String is: " + rev);
    }
}
