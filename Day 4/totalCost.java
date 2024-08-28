//total cost of three items with 18% gst.

import java.util.Scanner;

public class totalCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cost of Pencil : ");
        float a = sc.nextFloat();
        System.out.print("Cost of Pen : ");
        float b = sc.nextFloat();
        System.out.print("Cost of Eraser : ");
        float c = sc.nextFloat();
        float gst = (a + b + c)*0.18f;
        float total = (a + b + c)+gst;
        System.out.println("The total cost of the item with 18% tax : "+total);
        

        sc.close();
    }
}
