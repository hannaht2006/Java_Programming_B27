package Practices;

import java.util.Scanner;

public class Homework2 {
    /*
    Create three number variables
Find and print which number is bigger between the three

	ex:
		50
		45
		100

		output:
		100 is the biggest

     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter num1 : ");
        int num1 = input.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = input.nextInt();
        System.out.println("Enter num3 : ");
        int num3 = input.nextInt();

        if(num1 >num2 && num1 > num3){
            System.out.println(num1+ " is the biggest");

        }else if (num2 >num1 && num2 > num3){
            System.out.println(num2+ " is the biggest");
        }else {

            System.out.println(num3+ " is the biggest");
    }
}}
