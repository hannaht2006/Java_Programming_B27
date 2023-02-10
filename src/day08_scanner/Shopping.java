package day08_scanner;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

      Scanner input =  new Scanner(System.in);

        System.out.println("Enter the item name ");
         //String item = "Ball";
          String item = input.nextLine();

        System.out.println("What is the item price ");
         //double itemPrice = 5.99;
           double itemPrice = input.nextDouble();

        System.out.println("How many "+item + " /s do you want ");
          //int quantity = 3;
            int quantity = input.nextInt();
            input.nextLine();

        String order = "Your total for "+quantity+ " " +item + " is "+ quantity*itemPrice;
        System.out.println(order);
    }
}
