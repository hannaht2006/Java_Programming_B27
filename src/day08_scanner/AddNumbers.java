package day08_scanner;

import java.util.Scanner;
public class AddNumbers {
    /*
    Create a program that will ask the user to enter two numbers. Add the numbers and print the result
     */
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);// Scanner object
        System.out.println("Enter number 1 : ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = input.nextInt();

        System.out.println("Total : " +num1+num2);
        // System.out.println(num1+num2); same with: input.nextInt()+input.nextInt();

    }
}
