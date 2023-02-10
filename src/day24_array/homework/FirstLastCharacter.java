package day24_array.homework;

import java.util.Arrays;

public class FirstLastCharacter {
    /*
    Given a String array:

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
                };

Find and print all the first and last characters
Find and print all the middle character
Print each country as a char array

     */
    public static void main(String[] args) {
        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam","Albania", "Portugal", "Philippines", "Armenia",  "Colombia","Honduras", "Indonesia", "United States"};
        String [] initial = new String [countries.length];

        for (int i = 0; i < countries.length; i++) {
            char [] letters = countries[i].toCharArray();
            System.out.println(Arrays.toString(letters));
            initial[i] = "" + letters[0] + letters[letters.length-1];
        }

        System.out.println(Arrays.toString(initial));

    }
}
