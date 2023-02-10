package day03_variable;

import java.text.DecimalFormat;

public class Store {

    public static void main(String[] args) {
        int numberOfItems = 1000;
        System.out.println(numberOfItems + " in the store");// combine the value of the numberOfItems varluable with the characters 'in the store'
        numberOfItems = 700; // reassigned 700 into the valuable
        System.out.println(numberOfItems + " after the sale");

        int totalAfterShipment = numberOfItems + 5000;
        System.out.println("totalAfterShipment = " + totalAfterShipment); // shortcut soutv

        double totalCost = 10_000_000.99; //10,000,000.99 --> how we might want to write it, but commas are not valid java syntax, so we can use underscore in number, to improve readablility


        System.out.println(totalCost);

        float f = 19.99F;   // adding the letter f/F will tell compiler the float number is not the double number

        float f2 = 100; //100 is int type by default, and int is smaller than float, so there is no problem here
        System.out.println(f);
        System.out.println(f2);

        // int f2 = 10; valid if I wanted
        // float f2 = 100F;
        // float f2 = 100.99F;

        long population = 8_000_000_000L; // adding L/l to the number will change the type from int(the default) to a long type, because 8 billion was too big to be held in an int type
        System.out.println(population);

        long pop2 = 1_000_000; // L is not needed because 1 million is a valid number for int types, and that type can automatically be converted to a bigger type
        System.out.println(pop2);













    }
}
