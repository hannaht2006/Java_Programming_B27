package day21_nested_loops.homework;

import java.util.Scanner;

public class Duplicate {
    /*
    [IQ] Duplicate characters

    Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

    Ex:
        Input:
            AAABCCDEEF
        Output:
            ACE

        -> the characters A C and E are found in the String multiple times so they are duplicates

    variations:
        Write a program that can return the first duplicated character from a string
        Write a program that can return the index number of the first unique character.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.next();
        String dup = "";
        String noDup ="";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (!dup.contains(""+str.charAt(i))) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                if (count > 1) {
                    dup += str.charAt(i);
                }
                else {
                   noDup +=str.charAt(i);
                }
            }
        }
        System.out.print(dup);
        System.out.println();
        System.out.print(noDup);
    }
}
