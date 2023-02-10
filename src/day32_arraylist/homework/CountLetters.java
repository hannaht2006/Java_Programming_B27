package day32_arraylist.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountLetters {
    /*
    Count Letters

Create a method that will accept an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements

Ex:
Input:
	”java”, ”html”, “css”, “java”, “javascript”, “selenium”
	letter: ‘a’
Output:
	6
     */
    public static void main(String[] args) {

        char letter = 'a';

        Scanner input = new Scanner (System.in);
        System.out.println("Enter a String: ");
        String str = input.nextLine();

        ArrayList<String > words = new ArrayList<>(Arrays.asList(str));
        System.out.println(words);
        int count = 0;
        for (int i = 0; i< words.size(); i++){
            String s = words.get(i);
            for (int j = 0; j< s.length(); j++){
                if (s.charAt(j)==letter){
                    count ++;
                }
            }
            System.out.println(count);
        }
    }
}
