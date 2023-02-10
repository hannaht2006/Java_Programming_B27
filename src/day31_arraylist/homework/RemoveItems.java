package day31_arraylist.homework;

import java.util.ArrayList;

public class RemoveItems {
    /*
    Create an ArrayList of Strings
add these elements:
    Iron Man, Spider Man, Thor, Captain America, Hawkeye

    remove Thor by index

    remove Iron Man by element

    remove the first index

Print the ArrayList after each action to see how the change is made
     */
    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();
        items.add("Iron Man");
        items.add("Spider Man");
        items.add("Thor");
        items.add("Captain America");
        items.add("Hawkeye");
        System.out.println(items);

        items.remove(2);
        System.out.println(items);
        items.remove("Iron Man");
        System.out.println(items);
        items.remove(0);
        System.out.println(items);

    }
}
