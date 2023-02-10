package day13_switch_string;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        /*
        vending machine
        snacks
        1
        2
        3

        drinks
        4
        5
        6
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vending machine. Select the menu you want to see:\n\tSnacks\n\tdrinks");
        String menu = input.next();
        switch (menu){

            case "Snacks":
                System.out.println("Pick the snack:\n1) Chips 2) Cookies 3) Pretzels 4) Candies");
                int snackOption = input.nextInt();
                if (snackOption ==1){
                    System.out.println("Chips are selected");
                }else if (snackOption==2){
                    System.out.println("Cookies are selected");
                }else if (snackOption==3){
                    System.out.println("Pretzels dispensing");
                }else if (snackOption==4){
                    System.out.println("candies coming right up");
                }else {
                    System.out.println("Not a valid item");
                }
                break;

            case "Drinks" :
                System.out.println("Pick the drink  number:\n1) juice 2) soda");
                int drinkOption = input.nextInt();
                if (drinkOption ==1){
                    System.out.println("Juice are selected");
                }else if (drinkOption==2){
                    System.out.println("Soda are selected");
                }else {
                    System.out.println("Not a valid item");
                }
                break;

        }

    }
}
