package day26_multidimensional_array;

import java.util.Arrays;

public class ArrayExampleOne {
    public static void main(String[] args) {

        char [] upper = {'R', 'J', 'A'};
        char [] lower = {'p', 'z', 'q', 'e'};
        char [] other = {'4', '#', '*', '$', '&'};
        char [] [] chars = new char [3][]; // {upper, lower, other}; 3 is 3 inner array in the new array
        chars [0] = upper; // storing the upper char array as the first element of the 2D array
        chars [1] = lower;
        chars [2] = other;

        // printing each inner array
        System.out.println(Arrays.toString(chars[0]));
        System.out.println(Arrays.toString(chars[1]));
        System.out.println(Arrays.toString(chars[2]));

        //printing the whole 2D
        System.out.println(Arrays.deepToString(chars));// this method deepToString is used to print multi dimensional arrays


    }
}
