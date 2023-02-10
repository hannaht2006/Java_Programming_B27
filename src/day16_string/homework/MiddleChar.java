package day16_string.homework;

import java.util.Scanner;

public class MiddleChar {
    /*
    [Middle char]

Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.
    b) If the length of the string is odd there will be one middle character.

    Input:
        elephant
    Output:
        The middle characters: ph
     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("enter a word:");
        String word = input.next();

        int hafl = word.length()/2;
        String firstHalf = word.substring(0,hafl);
        String secondHalf = word.substring(hafl);

        if (word.length()%2 == 0){

            System.out.println(""+firstHalf.charAt(firstHalf.length()-1)+secondHalf.charAt(0));

        }else{

            System.out.println(word.charAt(hafl));
        }
    }
}
