//keep entering numbers till user enters a multiple of 10

import java.util.Scanner;

public class multipleOF_10 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        
        do
        {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            if(n%10==0)
             {System.out.println(n+" is multiple of 10.");
                break;
            }
            System.out.println(n+" is not multiple of 10");

        }    while(true);
        
        sc.close();
    }
    
}
