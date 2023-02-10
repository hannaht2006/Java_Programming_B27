package day23_array.homework;

import java.util.Arrays;

public class Reverse {
    /*
    Reverse Array

	Write a program that will reverse the order of any given array
		Ex:
		Input:
			[1, 2, 3, 4, 5]
		Output:n
			[5, 4, 3, 2, 1]
     */
    public static void main(String[] args) {
        String [] numbers = {"1", "2", "3", "4", "5"};
        String [] reverse = new String[numbers.length];

        for (int i = 0; i<= numbers.length -1 ; i++) {
            reverse[i] = numbers[(numbers.length-1)-i];

        }
        System.out.println(Arrays.toString(reverse));
    }
}
