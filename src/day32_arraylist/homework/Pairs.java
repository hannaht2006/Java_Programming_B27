package day32_arraylist.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Pairs {
    /*
    Switch Pairs

Given an ArrayList of words switch position for each pair in the List. A pair is an element and the element next to it.

The given ArrayList will always have an even number of elements so each element will always have a single pair.

Ex:
Input: {"Cat", "in", "the", "hat"}

There is two pairs:
"Cat" and "in"
 "the" and "hat"

Output: {"in", "Cat", "hat", "the”}
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList(Arrays.asList("Cat", "in", "the", "hat", "hello", "world"));
        for (int i = 0; i < list.size();i++){
            if (i%2==1){
                list.add(i-1, list.get(i));
                list.remove(i+1);

            }
        }
        System.out.println(list);
    }
}
