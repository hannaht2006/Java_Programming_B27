package day27_methods;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int [][] nums = {
                {10, 20, 30},
                {5, 10, 15},
                {1, 2, 3, 4}
        };
        int size = 0;
        for (int [] eachArray : nums){
            size += eachArray.length;
        }// purpose of this loop was to count the total of elements, which should be the size of the merged array
        int [] merged = new int [size];
        int indexToStore = 0;
        for (int [] eachArray : nums){
            for ( int eachNum : eachArray){
                merged [indexToStore++] = eachNum; // assign the eachNum to the merged array
            }
        }
        System.out.println(Arrays.toString(merged));
    }

}
