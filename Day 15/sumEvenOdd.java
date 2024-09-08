//aprogram that reads a set of integers, and then prints the sum of the even and odd integers.
import java.util.Scanner;

public class sumEvenOdd {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the number of integer: ");
        int n = sc.nextInt();

        int sumOdd = 0;
        int sumEven = 0;
        
        System.out.print(" Enter "+n+" integer: ");
        
        for (int i = 0; i < n; i++) {

            int number = sc.nextInt();
            if (number%2==0){
                sumEven = sumEven + number;
            }
            else{
                sumOdd =sumOdd + number ;
            }
        }
        System.out.println("Sum of Odd Integers are: "+sumOdd);
        System.out.println("Sum of Even Integers are: "+sumEven);

        sc.close();

    }
}