package Practices.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        /*
        String number to sum
         */

        ArrayList<String> nums = new ArrayList<>(Arrays.asList("123", "34", "513"));
        ArrayList<Integer> results = new ArrayList<>();

        //get the String one by one
        for (String number : nums) {
            //get the String value of integer
            int sum = getValue(number);

            //put the sum in the Integer list
            results.add(sum);
        }
        System.out.println(results);

    }

    private static Integer getValue(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {

            String c = "" + number.charAt(i);
            //convert String to Integer
            Integer integer = Integer.valueOf(c);
            sum += integer;
        }

    return sum;
    }
}

