package day12_switch.homework;

import java.util.Scanner;

public class Seasons {
    /*
    Season Finder

declare and assign a month number. Bases on the below data determine what season it is and what kind of clothes to wear. You can create your own expectations of what kind of clothes to wear based on the month


	12, 1, 2 	--> Winter
	3, 4, 5 	--> Spring
	6, 7, 8 	--> Summer
	9, 10, 11 	--> Fall

Ex:
	2
	It is winter, so wear a winter coat, gloves and a hat
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int month = 0;
        System.out.println("enter the month in number :");
        month = input.nextInt();

        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println(month +" is winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(month +" is spring");
                break;
            case 6:
            case 7:
            case 8:
                 System.out.println(month +" is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month +" is fall");
                break;
            default:
                System.out.println("enter unavailable month");
        }

    }
}
