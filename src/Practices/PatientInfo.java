package Practices;

import java.util.Scanner;

public class PatientInfo {

           public static void main(String[] args) {
            //Enter your code here
            Scanner scan = new Scanner (System.in);
            String firstName, lastName, email, street, state, city;
            int age, zipCode;
            double height, weight;
            long workPhoneNumber, personalPhoneNumber;
            boolean isMarried;

            System.out.println("Welcome to the patient portal !\n Please enter your personal information");
            System.out.println("Enter your first name");
            firstName = scan.next();
            System.out.println("Enter your last name");
            lastName = scan.next();


            // this part is already provided DO NOT CHANGE
            System.out.println("Enter your email");
            email = scan.next();
            scan.nextLine();//to capture Enter key press
            System.out.println("Enter your street");
            street = scan.nextLine();

            // continue for city
            System.out.println ("Enter your city");
            city = scan.next();
            System.out.println ("Enter your state");
            state = scan.next();
            System.out.println("Enter your zip code");
            zipCode = scan.nextInt();
            System.out.println("Enter your work phone number");
            workPhoneNumber = scan.nextInt();
            System.out.println("Enter your personal phone number");
            personalPhoneNumber = scan.nextInt();
            System.out.println("Enter your age");
            age = scan.nextInt();
            System.out.println("Enter your height");
            height = scan.nextDouble();
            System.out.println("Enter your weight");
            weight = scan.nextDouble();

            System.out.println ("Are you married?");
            isMarried = scan.nextBoolean();

            String fullName = firstName + lastName;
            String contact = "Work phone number: " +workPhoneNumber + ", personal phone number: "+ personalPhoneNumber+ ", email: "+ email;
            String address = street + ", "+ city+ ", "+ state + " "+ zipCode;

            System.out.println("Patient personal information");
            System.out.println("Full name: "+ fullName);
            System.out.println("Address: "+ address);
            System.out.println("Contact: "+ contact);
            System.out.println("Age: "+ age);
            System.out.println("Height: "+ height);
            System.out.println("Weight: "+ weight+ " pounds");
            System.out.println("Married: "+ isMarried);
}}
