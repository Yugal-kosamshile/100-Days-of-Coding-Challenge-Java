import java.util.Scanner;

public class invertedstar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = sc.nextInt();
       
        for(int line=1; line<=n;line++){
            
            for (int j = 1; j<=(n-line+1); j++) {
                System.out.print(" * ");
                
            }System.out.println();
        }

        sc.close();
    }
}
