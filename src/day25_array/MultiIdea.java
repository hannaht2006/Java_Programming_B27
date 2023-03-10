package day25_array;

import java.util.Arrays;

public class MultiIdea {
    public static void main(String[] args) {

        int [] a = {1, 2, 3};
        int [] b = {4, 5, 6};
        int [] c = {7, 8, 9};

        int [][] all = {a, b, c}; // create a 2d array
        //what are the elements for all array : 1d array (normal array)

        System.out.println(Arrays.toString(all[0])); // printing the first array --> [1, 2, 3]
        System.out.println(Arrays.toString(all[1])); // --> [4, 5, 6]
        System.out.println(Arrays.toString(all[2])); // --> [7, 8, 9]

        System.out.println("------------");
        System.out.println("First element of each inner array");
        System.out.println(all[0][0]); //print int number --> 1
        System.out.println(all[1][0]); // --> 4
        System.out.println(all[2][0]); //--> 7
    }
}
