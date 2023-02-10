package day20_loops.homework;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CountWords {
    /*
    Count Words
    Given a sentence determine how many words are in the String.
        Ex:
            Input:
                This has multiple words
            Output:
                4
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = input.nextLine().trim();
        int count=0;

        for (int i=0; i<=s.length()-1; i++){
            if (s.charAt(i)==' '){
                count +=1;
            }

        }
        System.out.println("Number of words: "+count+1);

    }

}
