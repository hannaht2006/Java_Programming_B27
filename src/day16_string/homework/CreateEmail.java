package day16_string.homework;

import java.util.Scanner;

public class CreateEmail {
    /*
    [Creating an email]

Ask user to enter two strings. Both strings should be at least 6 character long. If they are shorter than that print “Invalid data” and program should end.

If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cydeo.com” and print the final string as your created email.
The final email should be in all lowercase.

    input:
        JamesBond
        Secret
    output:
        jameret@cydeo.com
     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("enter first word:");
        String word1 = input.next().toLowerCase();
        System.out.println("enter second word:");
        String word2 = input.next().toLowerCase();

        boolean valid = word1.length()>=6 && word2.length()>=6;

        if(valid){
            System.out.println(word1.substring(0,4)+word2.substring(word2.length()-3)+"@cydeo.com");

    }else {
            System.out.println("\"Invalid data\"");
        }
    }
}
