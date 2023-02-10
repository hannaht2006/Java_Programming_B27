package day15_string.homework;

import java.util.Scanner;

public class Titles {
    /*
    create a class Title
ask the user to enter their name including titles
use the following titles to determine how to refer to the person

handle case sensitivity. User could enter a title as ms, or MS, or Ms. All should result in a valid result

	titles:

		Mr or Mister
		Ms or Miss or Madam
		Dr

	and some titles can come after a name:

		Sr
		Jr

Based on both starting and ending titles print the following messages:

		Mr or Mister: Hello Sir
		Ms or Miss or Madam: Hello Ma'am
		Dr: Hello Doctor

		Sr: Nice to meet you Senior
		Jr: Nice to meet you Junior

Note: It is possible to have both beginning and ending titles, one of them, or none of them
     */
    public static void main(String[] args) {

        String name = "";

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your name with title:");
        name = input.nextLine();
        name = name.toLowerCase();

        if (name.startsWith("mr")||name.startsWith("mister")) {
            System.out.println("Hello Sir");
        }
        if (name.startsWith("ms")|| name.startsWith("miss")||name.startsWith("madam")) {
            System.out.println("Hello Ma'am");
        }
        if (name.startsWith("dr")||name.startsWith("doctor")) {
            System.out.println("Hello Doctor");
        }
        if (name.endsWith("jr")) {
            System.out.println("Nice to meet you Senior");
        }
        if (name.endsWith("jr")) {
            System.out.println("Nice to meet you Junior");
        }

    }
}
