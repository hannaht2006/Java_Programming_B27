package Practices;

import java.util.Scanner;

public class Homework4 {
    /*
    create a sales amount variable
use the sales amount to determine the bonus you get at end of the month

	if your sales amount is less than 10000 you don't get any bonus

	if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000

	if your sales amount is more than or equal to 15000 you get a bonus of 7000

	print your bonus number
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sale amount : ");
        double saleAmount = input.nextDouble();
        if (saleAmount >= 15000) {
            System.out.println("You get bonus of 7000");
        } else if (saleAmount >= 10000 && saleAmount < 15000) {
            System.out.println("You get bonus of 5000");
        }
        if (saleAmount < 10000) {
            System.out.println("You don't get any bonus");
        }
    }
}
