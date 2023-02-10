package day10_if_statements.homework;

import java.util.Scanner;

public class Loan {
    /*
    create a class Loan
declare and assign a credit score variable
try to use ternary to determine of you are eligible for a loan
you are eligible if you have a credit score of 700 or above
if you are eligible print "loan approved"
otherwise print "loan rejected. Sign up for our credit program"
     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your credit score: ");
        int creditScore = input.nextInt();

        System.out.println(creditScore>=700? "loan approved": "loan rejected. Sign up for our credit program");
    }
}
