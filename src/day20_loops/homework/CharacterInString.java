package day20_loops.homework;

import java.util.Scanner;

public class CharacterInString {
    /*
    Characters in String
    Given a String print the ascii value codes for each character
        Ex:
            Input:
                java
            Output:
                106 97 118 97
     */
    public static void main(String[] args) {

        String s ="";
        char letter;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        s = input.nextLine();

        for (int i=0; i<= s.length()-1; i++){
            letter = s.charAt(i);
            System.out.print((int)letter + " ");
        }

    }
}
