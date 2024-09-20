import java.util.Scanner;

public class LeastCommonFactor {
 

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM
    public static int findLCM(int a, int b) {
        return Math.abs(a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking two inputs from the user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        // Finding the LCM
        int lcm = findLCM(num1, num2);
        
        // Displaying the LCM
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
        sc.close();
    }
}

    

