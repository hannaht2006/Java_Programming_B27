package day32_arraylist.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    /*
    Four or less

Given an ArrayList of Strings, go through and find Strings that are 4 characters or less. Take those Strings and put them into a different ArrayList. Print that ArrayList of words
Ex:
	Input:
		“apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
	Output:
		 [ tree, loop, cat ]

     */
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("apples", "tree","loop", "cat", "animal", "shortcut"));
        String result ="";

        for (String each : words){
            if (each.length()<=4){
                result += " "+ each;
            }
        }
        System.out.println(Arrays.toString(result.trim().split(" ")));

    }
}
