package day18_loops.homework;

import java.util.Scanner;

public class Calculation {
    /*
    write a program that calculates the factorial of a number:
    ex: 5! = 5 * 4 * 3 * 2 * 1 = 120
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count =1;
        int result=1;
        System.out.println("enter a number:");
        int num = input.nextInt();
        System.out.print(num +"! = ");

        while(count<=num){
            result *= count;
            System.out.print(count );

                System.out.print("*");

            count++;

        }
        System.out.println(" = "+result);
    }
}
