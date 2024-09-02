// A program to Reverse the given number.

import java.util.Scanner;

public class ReverseGivenNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int rev=0;
        while (n>0) {
           int lastdigit = n%10;
             rev = (rev*10) +lastdigit;
            n=n/10;
        } 
        System.out.println("The Reverse of the Given number is : "+rev);

        sc.close();
    }
}
