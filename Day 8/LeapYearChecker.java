/*Java program that takes a year from the user and print whether that year is a leap year or not.*/



import java.util.Scanner;



public class LeapYearChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Year : ");

        int Year= sc.nextInt();



        boolean x = ( Year % 4 ) == 0;

        boolean y = ( Year % 100 ) != 0;

        boolean z = ( Year % 100==0 ) && (( Year % 400 ) == 0);



        if(x && (y || z))

        System.out.println(Year + " is a Leap Year");

        else

        System.out.println(Year + " is not a Leap Year");



        sc.close();

    }

}
