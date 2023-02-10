package day28_methods;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        checkNum(0);
        checkNum(-12);
        checkNum(20);

        // from scanner:
        System.out.println("Number from Scanner");
        Scanner input = new Scanner (System.in);
        System.out.println("enter number: ");
        checkNum(input.nextInt());

        // call n:
        System.out.println("Call n:");
        int n = 33;
        checkNum(n);
    }

    public static void checkNum(int n){
        if (n > 0){
            System.out.println(n + " is positive");
        }else if (n<0){
            System.out.println(n + " is negative");
        }else{
            System.out.println(n + " is zero");
        }
    }
}
