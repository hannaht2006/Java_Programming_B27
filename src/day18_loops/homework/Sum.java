package day18_loops.homework;

import java.util.Scanner;

public class Sum {
    /*
    Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
     */
    public static void main(String[] args) {
        int result = 0;
        int num;

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a number:");
            num = input.nextInt();
            if (num>=0) {
                result = result + num;

            }else{
                System.out.println("you enter a negative number, we don't count it ");
            }

        } while (num > 0);

        System.out.println("your total is : "+result);



    }
}
