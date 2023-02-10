package day15_string.homework;

import java.util.Scanner;

public class InitialName {
    /*
    create a program to ask the user to enter their first name and last name.
Then print the initials of the person in uppercase format.
The intials are made up of the first letters of the first and last names.

	Ex:
		james
		bond

		JB

	Ex:
		anna
		lee

		AL

     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("enter your first name:");
        String firstName = input.nextLine();
        System.out.println("enter your last name:");
        String lastName = input.nextLine();

        firstName= firstName.toUpperCase();
        lastName=lastName.toUpperCase();

        char initial1 = firstName.charAt(0);
        char initial2 = lastName.charAt(0);

        System.out.println(""+initial1+initial2);

    }
}
