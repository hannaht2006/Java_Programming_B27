package day16_string.homework;

import java.util.Scanner;

public class MoveWord {
    /*
    [Move first word]
Given a sentence. Display the sentence with the first word moved to the end of the sentence.

    Input:
        Java is a fun language
    Output:
        is a fun language Java
     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("enter a sentence:");
        String sentence = input.nextLine();

        int index1 = sentence.indexOf(' ');
        String sentence1 = sentence.substring(index1+1);
        String firstWord = sentence.substring(0,index1);

        System.out.println(""+sentence1+" "+firstWord);

    }
}
