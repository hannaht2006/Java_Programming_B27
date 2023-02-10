package day16_string;

import java.util.Scanner;

public class AddressAndDetail {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your address:");
        String address  = input.nextLine();
        address = address.toUpperCase();
        address = address.trim();

        /*
        at this point we creat the address from the console made all the character uppercase
        and remove extra spaces from the beginning
        to do all the above steps at the same time we could also chain our methods
        String address = input.nextLine().toUpperCase().trim();
        string -> string -> string

        invalid use of chaining:
        String a = "abc";
        s.equals("abc").trim()
          boolean ---> trying to use a String method
          X INVALID ---> we can not use String methods on a boolean type

         */

        System.out.println(address);
        if (address.startsWith("500")){
            System.out.println("The house on the right side");
        }else if (address.startsWith("600")){
            System.out.println("The house on the left side");
        }
        if (address.contains("DR")|| address.contains("DRIVE")){
            System.out.println("We are on Drive");
        }else if (address.contains("LN")|| address.contains("LANE")) {
            System.out.println("We are on Lane");
        }else if (address.contains("AVE")|| address.contains("AVENUE")) {
            System.out.println("We are on Avenue");
        }


    }
}
