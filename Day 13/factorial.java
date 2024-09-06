//program to find the factorialof any number entered by the user.
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact= fact*i;
        }
        System.out.print("The factorial of "+n+" is : "+fact);

sc.close();
    }
}
