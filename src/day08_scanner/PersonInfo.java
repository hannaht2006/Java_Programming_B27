package day08_scanner;

import java.util.Scanner;

public class PersonInfo {
    /*
    first name
    last name
    address
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name :");
        String firstName = input.next();
        System.out.println("Enter your last name :");
        String lastName = input.next();
        System.out.println("Please enter your address : ");

        input.nextLine(); // for the enter input

        String address = input.nextLine();

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(address);




    }
}
