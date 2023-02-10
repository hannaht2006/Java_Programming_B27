package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FrequencyMethod {
    public static void main(String[] args) {

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('a', 'e', 'e', 'a', 't', 'p','i', 'o','o'));
        System.out.println(Collections.frequency(letters, 'a'));
        System.out.println(Collections.frequency(letters, 'E'));
        System.out.println(Collections.frequency(letters, 'o'));

        // given a String determine how many times the letter 'a' is in the String

        String s = "aabbbabeiffca";
        ArrayList<String> list = new ArrayList <>(Arrays.asList(s.split("")));
        /*
        s.split("") --> convert the String to a String []
        Arrays.asList(s.split("")) --> convert the String [] to ArrayList<String>
        new ArrayList <>(Arrays.asList(s.split(""))); --> create an ArrayList of each character as its own element

         */
        System.out.println(list);
        System.out.println(Collections.frequency(list, "a"));


    }
}
