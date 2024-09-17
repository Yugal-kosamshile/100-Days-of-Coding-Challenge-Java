import java.util.Scanner;


public class RemoveSpacesFromString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String: ");
        String string =sc.nextLine(); //Read String
        String res =string.replaceAll(" ", "");
        
        System.out.println("String without spaces: " + res);
        sc.close();
    }
}
