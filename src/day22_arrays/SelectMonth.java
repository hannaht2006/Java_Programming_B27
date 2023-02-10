package day22_arrays;

import java.util.Scanner;

public class SelectMonth {
    /*
    Ask use to type a number
    number is for the month
    print the month
     */
    public static void main(String[] args) {
        String[] month = {"January", "February", "march", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month number:");
        int num = input.nextInt();

        if (num >=1 && num <=12) {
            System.out.println(month[num-1]); //since the index of the month in the array is bigger than the num by 1 --> subtract num by 1 to have the matched month
        } else {
            System.out.println("invalid month number, should be 1-12");
        }
    }
}
