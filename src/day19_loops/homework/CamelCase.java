package day19_loops.homework;

import java.util.Scanner;

public class CamelCase {
    /*
    Camel Case

Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

Ex:

	Today is SUNDAY

	Output:

	todayIsSunday
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s ="";
        String s1="";
        int index1;
        System.out.println("Enter a sentence: ");
        s = input.nextLine().trim().toLowerCase();
        int len= s.length();
        for (int i =0; i<len;i++){
            if (s.charAt(i)==' ') {
                s = s.substring(0, i + 1) + s.substring(i + 1, i + 2).toUpperCase() + s.substring(i + 2);
            }

        }
        System.out.println(s.replace(" ", ""));
    }
}
