package Practices.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        /* four or less
        go through a ArrayList of String and get only 4 character or less to new ArrayList
         */

        List<String> list = new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));

      List<String> empty = new ArrayList<>();

        for(String s: list){
         boolean result = checkWordLength(s);
           if(result){
               empty.add(s);
           }
            }
        System.out.println(empty);
        }
       // ArrayList<String> listOfFourAndLess = new ArrayList<>(s);
        private static boolean checkWordLength(String s){
           /*
           if(s.length()<=4) {

               return true;
           }else{
               return false;
           }
            */
           return s.length()<=4;
        }

}
