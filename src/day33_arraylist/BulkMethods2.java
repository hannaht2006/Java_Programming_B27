package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer>nums = new ArrayList<>(Arrays.asList(4, 1, 1, 2, 3, 4, 5, 1, 4, 14, 4, 5, 123));

        System.out.println("contains 4 "+ nums.contains(4));
        System.out.println("contains 4 && 5 "+ (nums.contains(4) && nums.contains(5)));
        System.out.println("checking with containsAll "+ nums.containsAll(Arrays.asList(4, 3, 5, 1)));
        System.out.println("checking with containsAll "+ nums.containsAll(Arrays.asList(4, 3, 5, 6)));//--> false

        nums.retainAll(Arrays.asList(123, 4, 14, 0));// retain an element that doesn't exist : the method will just return false
        System.out.println(nums);

        ArrayList<Character> letters = new ArrayList <>(Arrays.asList('c', 'a', 'e', 'a', 'z'));

        letters.retainAll(Arrays.asList('a', 'z'));
        System.out.println(letters);

        // given a String determine how many vowels it has

        String s = "implementation";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        // converts the String to an ArrayList where each character a difference element

        list.retainAll(Arrays.asList("a", "e", "i","o", "u"));
        System.out.println(list.size());//-> 6
        System.out.println(list);//-> [i, e, e, a, i, o]

    }
}
