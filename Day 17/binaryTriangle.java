import java.util.Scanner;

public class binaryTriangle 
                            {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for(int line=1; line <= n; line++){
            
                int value = (line%2==0 ? 0 : 1);
            for (int number = 1; number <= line; number++) {
                System.out.print(value+" ");
                value = (value==1)?0:1;
            }

            
            System.out.println();
        }
sc.close();
        
    }
}


