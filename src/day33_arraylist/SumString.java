package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SumString {
     /*
    String Sum

Create a method that will accept an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
Ex:
Input:
“123”, “34”, “513”
Output:
[ 6, 7, 9 ]
     */
    //nums =[]
    //each: "123"
    //eachDigits :["1", "2", "3"]

    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>(Arrays.asList("123","34","5130","4913","1248"));
        System.out.println(sumDigits(list));
    };

    public static ArrayList<Integer> sumDigits(ArrayList<String>list){

        ArrayList<Integer>nums = new ArrayList<>();// create a empty ArrayList for sum
        //access to each element:
        for (String each : list){ // each will be every whole number as String format "123" ...."34" ...."513"
            int sum = 0;
            for (String eachDigits : each.split("")){ // splits the each into a String array where each digit is a separate element
                sum +=Integer.parseInt(eachDigits);
            }
            nums.add(sum);
        }
        return nums;
    }
}
