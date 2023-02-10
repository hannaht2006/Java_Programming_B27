package day15_string.homework;

import java.util.Scanner;

public class LongestWithA {
    /*
    create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

	Ex:
		"java"
		"mouse"
		"computer"

	Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String text = input.next();
        System.out.println("Enter your last name: ");
        String text2 = input.next();
        System.out.println("Enter your car made: ");
        String text3 = input.next();
        System.out.println("enter the character that you want to check:");
        String c = input.next();

        int t1 = text.length();
        int t2 = text2.length();
        int t3 = text3.length();

        if (text.contains(c)) {
            if (t1 > t2 && t1 > t3) {
                System.out.println(text);
            }
            if (t2 > t1 && t2 > t3) {
                System.out.println(text2);
            }
            if (t3 > t2 && t3 > t1) {
                System.out.println(text3);
            }
        }
        if (text2.contains(c)) {
            if (t1 > t2 && t1 > t3) {
                System.out.println(text);
            }
            if (t2 > t1 && t2 > t3) {
                System.out.println(text2);
            }
            if (t3 > t2 && t3 > t1) {
                System.out.println(text3);
            }
            if (text3.contains(c)) {
                if (t1 > t2 && t1 > t3) {
                    System.out.println(text);
                }
                if (t2 > t1 && t2 > t3) {
                    System.out.println(text2);
                }
                if (t3 > t2 && t3 > t1) {
                    System.out.println(text3);


                }
            }
        }
    }


}
