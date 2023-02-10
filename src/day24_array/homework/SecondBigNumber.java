package day24_array.homework;

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
        int [] numbers = {4,3,1,4,5,2,4,8,4,8};

        int maxNum = numbers[0];
        for (int i = 1; i < numbers.length-1; i++) {
            if (numbers [i]> maxNum){
                maxNum = numbers [i];

            }
        }
        int [] secondBig = new int [numbers.length];
        int indexSecond=0;
        for (int i = 0; i < numbers.length;i++) {
            if (numbers[i] < maxNum){
                secondBig[indexSecond] = numbers[i];
                indexSecond++;
            }
        }
        System.out.println(Arrays.toString(secondBig));
        int secondMax = secondBig[0];
        for (int i = 1; i < secondBig.length; i++) {
            if (secondBig[i] > secondMax){
                secondMax = secondBig [i];

            }
        }
        System.out.println(secondMax);
    }
}
