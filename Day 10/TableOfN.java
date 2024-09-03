import java.util.Scanner;

public class TableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int counter = 1;
        
        // Print the multiplication table for the given number
        while (counter <= 10) {
            System.out.println(counter + " * " + number + " = " + (counter * number));
            counter++;
        }
        
        // Close the scanner
        sc.close();
    }
}
