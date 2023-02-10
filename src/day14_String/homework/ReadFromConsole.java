package day14_String.homework;

import java.util.Scanner;

public class ReadFromConsole {
    /*
    Use scanner to read a String from the console
Remove extra spaces in the beginning or end
Print in all lowercase
Print the number of characters

     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your message :");
        String text = input.nextLine();
        String text1 = text.trim();
        System.out.println(text1.toLowerCase());
        System.out.println(text1.toUpperCase());
        System.out.println(text1.length());

    }
}
