package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreatingWithValues {
    public static void main(String[] args) {

        // convert array to ArrayList
        int [] arr = {3, 5, 1, 1};
        Arrays.asList(arr);// convert the array to ArrayList method : cannot do like this

        // Create an ArrayList with initial value

        Integer [] arr2 = {3, 4, 5, 6};//rapper class for array

        ArrayList<Integer> nums = new ArrayList<>( Arrays.asList(arr2));// arr is not valid because it is int primitive type
        System.out.println(nums);

        String [] fruit = {"apple", "orange"};
        ArrayList<String> str = new ArrayList<>(Arrays.asList(fruit));
        System.out.println(str);



        // the way we will usually create an ArrayList

        ArrayList<Integer> list =  new ArrayList <>(Arrays.asList(5, 2, 4, 1, 4));
        System.out.println(list);

        ArrayList<String> names = new ArrayList<>(Arrays.asList("james", "adam", "ana", "jane"));
        System.out.println(names);
    }
}
