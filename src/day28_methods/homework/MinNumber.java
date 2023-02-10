package day28_methods.homework;

import java.util.Arrays;

public class MinNumber {
    /*
    Min Number

create a method that will accept an int array and return the smallest number from the array
     */
    public static void main(String[] args) {
        int []nums = {1, 3, 0, 2, 4};
        System.out.println(minNumber(nums));

    }
    public static int minNumber (int[]nums){
        Arrays.sort(nums);
        int minNum = nums[0];
        return minNum;
    }
}
/*
public class MinNumber {
    public static int minNum (int[] arr){
        int minNumber = arr[0];
        for (int eachNum : arr){
            if(eachNum < minNumber){
                minNumber = eachNum;
            }
        }
        return minNumber;
    }

    public static void main(String[] args) {
        System.out.println(minNum(new int[]{9, 8, 3, 7, 1, 5}));
        System.out.println(minNum(new int[]{24, 34, 56, 16, 13, -5, 65}));
    }
}
 */
