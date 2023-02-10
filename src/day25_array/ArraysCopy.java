package day25_array;

import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3};
        int [] other = nums; // it is not creating a new array
       // two references array nums and other, but pointing to the same object --> we have only 1 object here
        nums [0] = 10; //reassign the first index to 10/
        System.out.println("Before:");
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(other));




        System.out.println("After:");
        System.out.println(Arrays.toString(nums)); // same result--> [10, 2, 3]
        System.out.println(Arrays.toString(other));// same result--->[10, 2, 3]

        other [2] = 25;
        System.out.println("After with other:");
        System.out.println(Arrays.toString(nums)); // same result--> [10, 2, 25]
        System.out.println(Arrays.toString(other));// same result--> [10, 2, 25]

        int [] arr = {3, 4, 1, 5, 12, 5, -10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // copyOf:

        int [] a = {5, 10, 15};
        int [] b = Arrays.copyOf(a, 3); // create a new array with size is 3, array b is different with array a
        System.out.println("Before:");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[1] = 100;
        System.out.println("After:");
        System.out.println(Arrays.toString(a)); //[5, 100, 15]
        System.out.println(Arrays.toString(b));//[5, 10, 15]


    }
}
