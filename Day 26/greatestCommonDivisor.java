import java.util.Scanner;

class greatestCommonDivisor{
  public static int findGCD(int a, int b){
    while(b!=0){
      int temp= b;
    b=a%b;
    a=temp;
    }
  return a;
}
public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  //Take two inputs
  System.out.print("Enter first number: ");
  int num1 =sc.nextInt();
  System.out.print("Enter second number: ");
  int num2 =sc.nextInt();

  //find gcd
  int gcd = findGCD(num1, num2);

  //display gcd
  System.out.print("The GCD of " +num1+ " and "+ num2+ " is: "+ gcd);
  sc.close();
}
}
