package day08_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeeReport {
    public static void main(String[] args) {


    /*
    full name
    job title
    salary --> ask each part
    company HQ
    full time
     */

    Scanner input = new Scanner (System.in);
        System.out.println("Enter your full name ");
        String fullName = input.nextLine();

        System.out.println("Enter your job title ");
        String jobTitle = input.nextLine();

        System.out.println("What is your hourly rate ");
        double hourlyRate = input.nextDouble();

        System.out.println("What is the average number hours in a week ");
        int hours = input.nextInt();
        double salary = 52*hourlyRate*hours; //52 weeks in a year
        System.out.println("salary = " + salary);

        input.nextLine(); // empty one to catch the enter input

        System.out.println("Company HQ ");
        String hqLocation = input.nextLine();

        System.out.println("Are you full time : true or false");
        boolean isFullTime = input.nextBoolean();

        String report = fullName + " is a "+ jobTitle + " he/she makes "+ salary + " because he/she is fulltime "+isFullTime + ". The HQ is located at "+hqLocation;
        System.out.println(report);



}}
