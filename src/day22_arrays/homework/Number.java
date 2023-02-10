package day22_arrays.homework;

import java.util.Scanner;

public class Number {
    /*
    Create a program that will ask the user to enter a number and print the number as a word. Set a range from 0 - 15 and any number not in the range should get an invalid number message

    Ex:
> 1
        one

> 10
        ten
     */
    public static void main(String[] args) {
        String[] number = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen"};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();

        if (num >0 && num <= 15){
            System.out.println(number[num]);
        }else{
            System.out.println("Invalid number");
        }
    }
}
