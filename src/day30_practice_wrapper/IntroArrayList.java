package day30_practice_wrapper;

import java.util.ArrayList;
import java.util.Arrays;

public class IntroArrayList {
    public static void main(String[] args) {

        int [] a = {4, 2, 1};
        System.out.println("Number of element; " + a.length);
        System.out.println(("Print a whole array: "+ Arrays.toString(a)));
        System.out.println("Access the first element: " + a[0]);
        System.out.println("Add elements to the array: - CANNOT change size of array after creation");
        System.out.println("Remove element from the array ?_ CANNOT do it");
        System.out.println("Array can hold values that are primitive types & object types");

        System.out.println("--------------------");

        ArrayList <Integer> nums = new ArrayList <>(); // make empty ArrayList, ArrayList is flexible, don't have to assign the size
        System.out.println("Number of elements: " +nums.size());
        System.out.println("Print whole ArrayList: "+ nums);

        System.out.println("adding to ArrayList: .add()method");
        nums.add(5);
        nums.add(10);
        // no need to define the index (it's benefit)
        System.out.println(nums);//--> [5, 10]
        System.out.println(nums.size());//--> 2
    }
}
