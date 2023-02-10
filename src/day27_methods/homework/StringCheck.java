package day27_methods.homework;

import java.util.Scanner;

public class StringCheck {
    /*
    create a method that accepts a String and print each character of the String on a separate line
     */

    public static void character(String str) {
        for (int i = 0; i < str.length();i++){
            System.out.println(""+ str.charAt(i));
        }
    }

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a word: ");
            String str = input.next();
            character(str);
    }
}
