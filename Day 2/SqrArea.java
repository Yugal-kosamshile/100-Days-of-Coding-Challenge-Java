import java.util.Scanner;

public class SqrArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("The Side of Square");
        int side = sc.nextInt();

        System.out.println("Area of Square is : " + side*side);
        sc.close();
    }
}
