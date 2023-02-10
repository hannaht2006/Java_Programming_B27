package day26_multidimensional_array.homework;

import java.util.Arrays;

public class MergeArray {
    /*
    Given a 2D int array merge the elements into one 1D array

Ex:
       int [][] nums = {
                {10, 20, 30}, {5, 10, 15}
        };

       Output:
              [ 10, 20, 30, 5, 10, 15 ]
     */
    public static void main(String[] args) {
        int [][] nums = {
                {10, 20, 30}, {5, 10, 15}
        };
        int length =0;
        for (int i = 0; i < nums.length; i++) {
            length += nums[i].length;
        }
        int [] mergeNum = new int [length];
        int index=0;
            for (int i = 0; i< nums.length; i++){

                for (int j = 0; j < nums[i].length; j++){
                    mergeNum [index] += nums[i][j];
                    index++;
        }
            }
        System.out.println(Arrays.toString(mergeNum));

        }
    }

