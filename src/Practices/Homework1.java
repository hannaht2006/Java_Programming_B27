package Practices;

import java.util.Scanner;

public class Homework1 {
    /*
    Create two number variables
Find and print which number is bigger between the two

	ex:
		50
		45

		output:
		50 is bigger
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter num1 : ");
        int num1 = input.nextInt();
        System.out.println("enter num2 : ");
        int num2 = input.nextInt();

        if(num1 >num2){
            System.out.println(num1+ " is bigger");
        }else {
            System.out.println(num2 + " is bigger");
        }
    }
}
