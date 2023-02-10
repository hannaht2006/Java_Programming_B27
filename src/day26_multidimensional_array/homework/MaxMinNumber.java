package day26_multidimensional_array.homework;

import java.util.Arrays;

public class MaxMinNumber {
    /*
    Given a 2D int array find the max and min number from the whole array

       int[][] {
              {1, 5, 2, 23},
              {-12, 41, -5, -2},
              {1, 5, 1, 5}
       }

       Max: 41
       Min -12

Extra: Find the max and min between each inner array
     */
    public static void main(String[] args) {
        int[][] nums = {
            {1, 5, 2, 23},
            {-12, 41, -5, -2},
            {1, 5, 1, 5}

        };


        int maxNum = nums[0][0];
        int minNum = nums[0][0];
        for (int [] eachInner : nums){

            Arrays.sort(eachInner);

            if (eachInner[eachInner.length-1]> maxNum){
                maxNum =eachInner[eachInner.length-1];
            }
            if (eachInner[0]< minNum){
                minNum = eachInner[0];
            }

        }
        System.out.println("----------");

        System.out.println("Max number: " +maxNum);
        System.out.println("Min number: " +minNum);
           }




        }



