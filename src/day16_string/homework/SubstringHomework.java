package day16_string.homework;

import java.util.Scanner;

public class SubstringHomework {



        public static void main(String[] args) {
            //DO NOT TOUCH FOLLOWING LINE/LINES
            Scanner scan = new Scanner(System.in);
            System.out.println("enter email:" );
            String email = scan.next();

            //WRITE YOUR CODE BELOW

            int fIndex = email.indexOf('_');
            int sIndex = email.indexOf('@');

            String firstName = email.substring(0,fIndex);
            String lastName = email.substring(fIndex+1,sIndex);
            String domain = email.substring(sIndex+1);

            System.out.println("First name: "+firstName);
            System.out.println("Last name: "+lastName);
            System.out.println ("Domain: " + domain);
}}
