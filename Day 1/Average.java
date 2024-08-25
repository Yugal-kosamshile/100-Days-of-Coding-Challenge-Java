
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of a");
        int a = sc.nextInt();
        System.out.println("Enter Value of b");
        int b = sc.nextInt();
        System.out.println("Enter Value of c");
        int c = sc.nextInt();

        int avg=(a+b+c)/3;
        System.out.println("The Average of the a, b & c is :"+avg);
       
        sc.close();
    }
    
}
