package day23_array.homework;

import java.util.Arrays;

public class ShortestElement {
    /*
    Shortest and Longest words from String array

	• Write a program that can return the shortest string element from a String array
	• Write a program that can return the longest string element from a String array

Hint: a good default value is the first element
     */
    public static void main(String[] args) {
        String[] words = {"it", "was", "very", "cold", "yesterday"};
        String[] shortest = new String[1];
        String[] longest = new String[1];

        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].length() > (words[i + 1].length())) {
                longest[0] = words[i];
            } else {
                longest[0] = words[i + 1];
            }
        }

        System.out.print("Longest word is: ");
        System.out.println(Arrays.toString(longest));


        for (int j = 0; j < words.length; j++) {
            if (words[j].length() < (words[j + 1].length())) {
                shortest[0] = words[j];
            } else {
                shortest[0] = words[j + 1];
            }
        }
        System.out.print("Shortest word is: ");
        System.out.println(Arrays.toString(shortest));
    }
}
