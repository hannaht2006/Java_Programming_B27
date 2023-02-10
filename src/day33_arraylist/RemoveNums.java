package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveNums {
    public static void main(String[] args) {

        ArrayList<Integer> nums =  new ArrayList<>(Arrays.asList(0, 1, 5, 2, 3, 2, 4, 9,5,8, 6, 7, 1, 10, 0 ));

        // remove all number that less than 5

        for (int i = 0; i< nums.size(); i++){
            if (nums.get(i) < 5){
                nums.remove(i);
                i--;// because ArrayList element will shift to left if we remove an element.the index will change --> we set i-- to make sure the shift number still be checked, don't skip any element.
            }
        }
        System.out.println(nums);
        System.out.println("---------------------------");

// remove all < 5 with removeIf () method

        ArrayList<Integer> nums2 =  new ArrayList<>(Arrays.asList(0, 1, 5, 2, 3, 2, 4, 9, 5, 8, 6, 7, 1, 10, 0 ));
        nums2.removeIf(n -> n <5); // n will be every element

        System.out.println(nums2);
    }
}
