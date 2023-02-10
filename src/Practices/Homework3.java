package Practices;

import java.util.Scanner;

public class Homework3 {
    /*
create an int value for the time of the day. Use a 24 hour format
use the given time of day to display a message
hint: use seperate if statements

	if the hours are from 6 - 11, print: Good morning
	if the hours are from 12 - 16, print: Good evening
	if the hours are from 17 - 23 or 0 - 5, print: Good night


     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time: ");
        int time = input.nextInt();

        if (time >= 6 && time <= 11) {
            System.out.println("Good morning");

        }
        if (time >= 12 && time <= 16) {
            System.out.println("Good evening");

        }
        if ((time >=17 && time <=23) ||(time >=0 && time<=5)){
            System.out.println( " Good night");
        }
    }
}
