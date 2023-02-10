package day12_switch.homework;

import java.util.Scanner;

public class DaysInMonth {
    /*
    Days In Month (slightly different version than before)

Write a program that will accept a month name and outputs how many days are in that month

data:

    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days

     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
                String month = "";
        System.out.println("enter the month :");
                month = input.nextLine();

        switch (month){
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":

                System.out.println("31 days in "+ month);
                break;
            case "february":
                System.out.println("28 days in "+ month);
                break;
            case "april":
            case "june":
            case "september":
            case "november":

                System.out.println("30 days in "+ month);
                break;
            default:
                System.out.println("enter unavailable month");
        }

    }
}
