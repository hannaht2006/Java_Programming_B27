package day11_nested.homework;

import java.util.Scanner;

public class SecureCode {
    /*
    declare and assign two expected numbers:
pincode: 1234
ssn: 1111
ask the user to enter the two numbers and compare them with the system
values defined above. If they match print Authentication successful
if they don't match print all the reasons that authentication failed:
if the pincode was incorrect print: Pin Code is incorrect
if the ssn was incorrect print: Last 4 SSN numbers are incorrect
     */
    public static void main(String[] args) {
        int pinCode = 1234;
        int ssn = 1111;
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your pincode: ");
        int pinCode1 = input.nextInt();

        if (pinCode1 == pinCode){
        System.out.println("Enter your last 4 SSN: ");
        int ssn2 = input.nextInt();
            if (ssn2 == ssn){
                System.out.println("Authentication successful");
            }
            else {
                System.out.println("Last 4 SSN numbers are incorrect");
            }
        }
        else{
            System.out.println("Pin Code is incorrect");
        }

        }
}
