package Practices;

import java.util.Scanner;

public class PracticeScanner5 {
    /*
    Create a program that will ask the user to enter a salary(double) and number of hours(int). Calculate the hourly rate.
    hourly rate = salary / (hours weekly * 52)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter salary $: ");
        double salary = input.nextDouble ();
        System.out.println("Enter hours: ");
        int hours = input.nextInt();
        double hourlyRate = salary/(hours*52);
        System.out.println("Hourly Rate = "+hourlyRate);



    }
}
