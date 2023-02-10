package day31_arraylist.homework;

import java.util.ArrayList;

public class Adds {
    /*
    Create an ArrayList of Strings
add these elements:
    add Hat
    add Shoes
    add Jacket in middle of Hat and Shoes
    add Towel in the beginning
    add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made

     */
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Hat");
        System.out.println(items);
        items.add("Shoes");
        System.out.println(items);
        items.add(1,"Jacket");
        System.out.println(items);
        items.add(0, "Towel");
        System.out.println(items);
        items.add(1, "Car");
        System.out.println(items);
    }
}
