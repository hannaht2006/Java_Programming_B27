package day07_scanner;

import java.util.Scanner;

public class FirstScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);// how to make a Scanner variable/object
        System.out.println("please enter a number ");
        int number = input.nextInt();
        System.out.println("this is your number: "+number);



    }
}
