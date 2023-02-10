package Practices;

import java.util.Scanner;

public class Homework7 {
    /*
    create a int variable to represent the month number, where 1 is Janurary and 12 is Decemeber.
use the month number input to determine how many days are in that month.
use the following data to help you determine the number of days in each month:

	Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
	Months that has 30 days: 4, 6, 9, 11
	Month that has 28 days: 2

	ex:
		12
		31 days

	ex:
		9
		30 days
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in );
        System.out.println("Enter month: ");
        int month = input.nextInt();

        if (month ==1||month ==3||month ==5 ||month==7||month==8||month==10||month==12) {
            System.out.println("31 days");
        }
     if (month ==2){
            System.out.println("28 days");
        }

        if (month ==4||month==6||month==9||month==11){
            System.out.println("30 days");
        }



    }
}