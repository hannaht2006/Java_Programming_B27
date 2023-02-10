package day25_array;

import java.util.Arrays;

public class SecondBigNumber {
    /*
    [IQ] Second Biggest Number

Given an Array of numbers. Find and print the 2nd biggest number.

Note the 2nd biggest should be unique meaning it should be different from the max number

Example:
	Input:
		[4,3,1,4,5,2,4,8,4,8]
	Output:
		5
     */
    public static void main(String[] args) {
        int[] nums = {4, 3, 1, 4, 5, 2, 4, 8, 4, 8};
        Arrays.sort(nums);
        System.out.println("Max number: " + nums[nums.length - 1]);
        System.out.println(Arrays.toString(nums));


        int max = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 0; i--) {// read the numbers from the end, we sorted so I will keep running until i find a new number that is not the same as the max number
            if (nums[i] != max) {
                System.out.println("second Max: " + nums[i]);
                break;
            }
        }
    }
}
