package day24_array.homework;

import java.util.Arrays;

public class Palindrome {
    /*
    [IQ] Longest Palindrome

	Given a String array. Find the longest Palindrome String in your array.

		Ex:
		Input:
			["java", "longer word", "civic", "apple", "racecar", "mom", "anna"]
		Output: racecar

		Ex:
		Input: ["abc", "dna", "kevin", "joe", "lamp"]
		Output: No palindrome
     */
    public static void main(String[] args) {
        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String palindrome = "";
        String reverseEach = "";

        for (String each : words) {
            each = each.replace(" ", "");
            String eachR = "";
            for (int i = each.length() - 1; i >= 0; i--) {

                eachR += each.charAt(i) + "";
            }
            reverseEach += eachR + " ";
        }
        System.out.println(reverseEach);
        String[] reverse = reverseEach.split(" ");
        System.out.println(Arrays.toString(reverse));

        for (int i = 0; i < words.length - 1; i++) {
            if (reverse[i].equals(words[i])) {
                palindrome += words[i]+" ";
            }else{
                System.out.println("No palindrome");
            }
        }
        System.out.println(palindrome);
        String[] palin = palindrome.split(" ");
        System.out.println(Arrays.toString(palin));
        String[] longgestP = new String[1];

        for (int i = 0; i < palin.length-1; i++) {
            if (palin[i].length() > palin[i + 1].length()) {
                longgestP[0] = palin[i];
            } else {
                longgestP[0] = palin[i + 1];
            }
        }
        System.out.println(Arrays.toString(longgestP));
    }
}
