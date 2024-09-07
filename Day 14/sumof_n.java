import java.util.Scanner;

public class sumof_n {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int sum=0;
        int i=1;

        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of first "+ n + " natural number is : " +sum);
            
        sc.close();
    }
    
}
