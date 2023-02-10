package day33_arraylist.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class PalidromeArrayList {
    /*
    All Palindrome

Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings
Ignore case sensitivity

Ex:
Input:
     "Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo”, "Eye"
Output:
    Anna, Racecar, Level, Eye
     */
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>(Arrays.asList("Anna", "Java",  "Python", "Racecar", "Level", "Cydeo", "Eye"));
        str.removeIf(p -> !isPalidrome(p));
        System.out.println(str);

    }
    public static boolean isPalidrome (String str){

        return reverse(str).equalsIgnoreCase(str);
    }

    public static String reverse (String str){
        String reverse ="";
        for (int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }


}
