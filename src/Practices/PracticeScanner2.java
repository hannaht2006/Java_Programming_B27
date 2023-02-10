package Practices;

import java.util.Scanner;

public class PracticeScanner2 {
    /*
    Create a program that will ask the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter the price : ");
        double price = input.nextDouble();
        System.out.println("quantity: ");
        int quantity = input.nextInt();
        double revenue = price*quantity;
        System.out.println("Revenue = "+revenue);


    }
}
