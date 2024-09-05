//Check whether input number is prime number or not.

import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        if (n==2) {
            System.out.println("2 is a prime number.");
        } else {

            boolean isPrime = true;  
            for (int i = 2; i <= n-1; i++) {
                if (n%i==0) {
                     isPrime = false;
                    
                } 
            }
            if (isPrime==true){
                System.out.print(n+" is a prime number");
            }else {
                System.out.print(n+" is not a prime number");
            }
            
        }
     sc.close();   
    }
}
