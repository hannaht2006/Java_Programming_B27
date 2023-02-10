package day14_String.homework;

import java.util.Scanner;

public class Password {
    /*
    Declare and assign a String for password
the password should be more than 8 character long
print: Valid password or Invalid password
     */
    public static void main(String[] args) {
        String password = "java@Cydeo";
        String s = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your password (password should be more than 8 character long): ");
        String passwordEnter = input.next();

        if (passwordEnter.equals(password)) ;
        {
             s = "Valid password";

            //  System.out.println(s);

        }
        if (!passwordEnter.equals(password)) {
             s = "invalid password";

        }
        System.out.println(s);


    }
}
