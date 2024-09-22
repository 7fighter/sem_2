package Lab;

import java.util.Scanner;
public class Assi {
    public static void main(String[] args) {
        final double TAX_RATE = 0.055;
        Scanner sc = new Scanner(System.in);
        System.out.println("Item description");
        String item = sc.nextLine();
        System.out.println("Item Price: $");
        double price = sc.nextDouble();
        double tax = price + TAX_RATE;
        double total = price*tax;
        System.out.println(item+"  $"+price);
        System.out.println("tax  $"+ tax);
        System.out.println("total $"+total);



        
    }
    
}
