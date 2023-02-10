package day32_arraylist.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters2 {

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
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        System.out.println(words);
        int count = 0;
        char letter = 'a';
        for(int j = 0; j<words.size();j++){
            String s = words.get(j);
           for(int i = 0; i<s.length();i++) {
               if(s.charAt(i)=='a'){
                   count +=1;
               }
           }
        }
        System.out.println(count);
    }
}
