package day29_methods;

import my_utils.StringUtil;

public class DuplicateCharacters {
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
        System.out.println(getDuplicateCharacters("aaabcccdd"));
    }

    public static String getDuplicateCharacters (String str){

        String duplicate = "";
        for (int i = 0;i <str.length(); i++ ){
            // str.charAt(i) --> give every character

            if (duplicate.contains(""+str.charAt(i))){
                continue;
            }
            int frequency = StringUtil.frequencyOfChar(str, str.charAt(i));

            if (frequency >1) {
                duplicate += str.charAt(i);
            }
        }
        return duplicate;
    }
}
