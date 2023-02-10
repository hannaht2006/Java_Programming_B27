package day28_methods.homework;

import java.util.Arrays;

public class MaxNumber {
    /*
Max Number

create a method that will accept an int array and return the biggest number from the array


*/
    public static void main(String[] args) {
        int []nums = {1, 3, 0, 2, 4};
        System.out.println(maxNumber(nums));

    }
    public static int maxNumber (int[]nums){
        Arrays.sort(nums);
        int maxNum = nums[nums.length-1];
        return maxNum;
    }
}

