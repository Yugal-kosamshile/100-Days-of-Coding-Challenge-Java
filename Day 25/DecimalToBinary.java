import java.util.Scanner;

class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        String binary = "";

        while (n != 0) {
            int r = n % 2;  // Get remainder when dividing by 8
            binary = r + binary;  // Append remainder to the front of the octal string
            n /= 2;  // Update n to be the quotient of division by 8
        }

        System.out.println("The binary equivalent is " + binary);
        sc.close();
    }
}
