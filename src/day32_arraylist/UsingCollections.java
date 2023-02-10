package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollections {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(400, 426, 125, 451, 485, 904, 418, 134, 146, 466));
        System.out.println(Collections.max(list));// max and min is class from java
        System.out.println(Collections.min(list));

        System.out.println("Before: "+list);
        Collections.sort(list);
        System.out.println("After: "+list);

        System.out.println("2nd min: "+list.get(1));
        System.out.println("2nd max: "+list.get(list.size()-2));

        // alternative: list.remove(collections.max(list));
        // use collections.max(list); again --> 2nd max

        Collections.shuffle(list); //randomly the order of the list
        System.out.println(list);

    }
}
