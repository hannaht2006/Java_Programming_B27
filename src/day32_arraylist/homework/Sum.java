package day32_arraylist.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Sum {
    /*
    String Sum

Create a method that will accept an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
Ex:
Input:
“123”, “34”, “513”
Output:
[ 6, 7, 9 ]
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList(Arrays.asList("123","34","513"));

        String sumList ="";

        for(int i = 0; i< list.size();i++){
            int sum = 0;
            String s = list.get(i);
            String [] num = s.split("");

            for (String eachn :num){
                Integer n = Integer.parseInt(eachn);
                sum += n;
            }
            sumList += " "+sum;
        }

        System.out.println(Arrays.toString (sumList.trim().split(" ")));
    }
}
