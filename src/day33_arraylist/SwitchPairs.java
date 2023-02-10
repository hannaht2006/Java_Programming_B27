package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwitchPairs {
    /*
    Switch Pairs

Given an ArrayList of words switch position for each pair in the List. A pair is an element and the element next to it.

The given ArrayList will always have an even number of elements so each element will always have a single pair.

Ex:
Input: {"Cat", "in", "the", "hat"}

There is two pairs:
"Cat" and "in"
 "the" and "hat"
     */
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<> (Arrays.asList("Cat", "in", "the", "hat", "hello", "world"));
        System.out.println(switchPairs(list));
    }
// switch pair in normal way:
    public static ArrayList<String> switchPairs (ArrayList<String>list){

        for (int i = 0; i < list.size(); i+=2){
            //System.out.println("pairs: "+list.get(i)+ " & "+ list.get(i+1));

            String temp = list.get(i);
            list.set(i, list.get(i+1));
            list.set(i+1, temp);
        }
        return list;
    }

    // swap with Collection:
    public static ArrayList<String> switchPairs2 (ArrayList<String>list){

        for (int i = 0; i < list.size(); i+=2){
            //System.out.println("pairs: "+list.get(i)+ " & "+ list.get(i+1));

            Collections.swap(list, i, i+1);
        }
        return list;
    }

}
