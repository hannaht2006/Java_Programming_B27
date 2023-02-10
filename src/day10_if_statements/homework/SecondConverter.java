package day10_if_statements.homework;

import java.util.Scanner;

public class SecondConverter {
    /*
    Possible algorithm for seconds convertor

Use a combination of division and remainder

the program gets seconds as an input

determine how many seconds are in an hour. Use this to find out how many hours were given, then take the hours counted out to determine the seconds left

then determine how many seconds are in a minute and find out how many minutes are given. Then take the minutes out of the total seconds left

you will also be left with seconds


This is one possible solution. Try to write code to do these steps. I will share some sample solution later this week
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s,hours, minutes, seconds;
        System.out.println("Enter number of second:");
        s = input.nextInt();

        hours = s/3600;
        minutes = (s % 3600)/60;
        seconds = ((s % 3600)%60);
        System.out.println(hours + " hrs "+ minutes + " minutes "+ seconds + " seconds");
    }
}
