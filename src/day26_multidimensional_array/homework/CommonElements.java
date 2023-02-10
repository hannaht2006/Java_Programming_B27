package day26_multidimensional_array.homework;

import java.util.Arrays;

public class CommonElements {
    /*
    Write a program that can print out the common elements from each inner element of a 2D
array

Ex:
       int[][] arr {
              {4, 1, 24, 5},
              {24, 1, 5, 2},
              {4, 1, 5, 1}
       }

     */
    public static void main(String[] args) {
        int[][] arr = {
                {4, 1, 24, 5},
                {24, 1, 5, 2},
                {4, 1, 5, 1, 24}
        };
        String element = "";
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                for (int k = 0; k < arr[2].length; k++) {
                    if (arr[0][i] == arr[1][j] && arr[0][i] == arr[2][k]) {
                        if (!element.contains("" + arr[0][i])) {
                            element += arr[0][i] + " ";

                        }
                    }
                }
            }
        }
        String[] newElement = element.trim().split(" ");
        System.out.println(Arrays.toString(newElement));
    }
}
/*
make 3 array from 2D array:

 public static void main(String[]args){
        int[][] arr = {
                {4, 1, 24, 5},
                {24, 1, 5, 2},
                {4, 1, 5, 1}
        };

        int[] arr1 = arr[0];
        int[] arr2 = arr[1];
        int[] arr3 = arr[2];

       String output = "";

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    for (int k = 0; k < arr3.length; k++) {

                        if (arr1[i] == arr2[j] && arr2[j] == arr3[k] && arr1[i] == arr3[k]) {
                            if (!(output.contains("" + arr1[i]))) {

                                output = "" + arr1[i];
                                System.out.println(output);
                                //System.out.println(arr3[k]);
                            }}

                        }}}}}
 */

