package Practices.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        /*
        target word
         */
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", " javascript", " selenium", "css"));

        String target = "java";
        int count = 0;
        //get the word one by one
        for(String each : words){
            //check the word, which one equal with target
            boolean result = checkWord(each, target);
            // count if it is correct
            if(result){
               count++;
            }

        }
        System.out.println(count);
    }

    private static boolean checkWord(String each, String target) {
        return each.equals(target);
    }
}
