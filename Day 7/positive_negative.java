/*Java program to get anumber from the user and print whether it is positive or negative*/

import java.util.Scanner;

public class positive_negative {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if (n>0){
            System.out.println(n+" is a Positive number");
        }else{
            System.out.println(n+" is a Negative number");
        }

        sc.close();
    }
}
