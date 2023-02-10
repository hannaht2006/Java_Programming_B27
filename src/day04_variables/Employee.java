package day04_variables;

public class Employee {
    public static void main(String[] args) {
        /*
        declare and assign these variables with the most appropriate datatypes:

        - first name, last name, company name, job title, suite(char), employee id, number of PTO, salary, is full time

    declare new variables and use concatenation from previous variables to set their values

        - full name (first and last name)
        - email (first name + employee id @ company name.com)
        - benefits (salary, number of PTO and add "work from home")

    create a summary of the information and print it. Be creative
        Example output: Employment information for James Bond. Secret Agent for MI6, based in suite C. Mr. Bond is full time: true. Contact Mr. Bond at James7@MI6.com. Current benefits include $1000000 salary a year, 20 PTO days and work from home.
         */

        String firstName, lastName, companyName, jobTitle;
        firstName = "Barbie";
        lastName = "Doll";
        companyName = "Disney";
        jobTitle = "Actress";
        char suite = 'A';
        int employeeId = 1234;
        int numberOfPto = 40;
        long salary = 120000;
        boolean isFullTime = true;

        String fullName, email, benefits;
         fullName = firstName + " " +lastName;
         email = firstName + employeeId + "@" +companyName +".com";
         benefits = "$" +salary +" a year, "+ numberOfPto + " PTO days, "+ " work from home.";

        System.out.println("Employment information for:" + fullName+ " is " +jobTitle+ " for " + companyName + ". Her studio at suite " + suite + "\nMss." + firstName+ " is Full Time: " + isFullTime +" . Contact Mss. "+ firstName+ " at " + email+ " \ncurrent benefits included " +benefits);

    }
}
