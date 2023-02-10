package day22_arrays.homework;

import java.util.Scanner;

public class Days {
    /*
    Create a program that will ask the user to enter a number for the day of the week. Print the day of the week based on:

    1 - Monday
    2 - Tuesday
    ...
    7 - Sunday

Use array, not if statement or switch
     */
    public static void main(String[] args) {
        String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day in number:");
        int num = input.nextInt();
        if (num>0&& num <7){
            System.out.println(day[num-1]);
        }else{
            System.out.println("enter the invalid number");
        }
    }
}
