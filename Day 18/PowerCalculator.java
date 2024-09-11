import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base number
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        // Input exponent
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        // Calculate power
        double result = Math.pow(base, exponent);

        // Output the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
     scanner.close();   
    }
}
