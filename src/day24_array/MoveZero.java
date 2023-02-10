package day24_array;

import java.util.Arrays;

public class MoveZero {
    /*
    Move Zeros

	Write a program that will move all the zero numbers to the end of the array. The rest of the numbers will move over in position
     */
    public static void main(String[] args) {
        int []num = {10, 0, 5, 0, 1, 0};
        int [] fixed = new int [num.length];// creat and [0,0,0,0,0,0]--->[10,5,1,0,0,0]
        int indexToRead = 0; //read every element from beginning to end
        int indexToStore = 0; // store values into the fixed array, maybe will not increment each time

        //indexToRead:0, 1,2,3,4,5,6
        //indexToStore:0,1,1,2,2,3
        while (indexToRead< num.length){
            if (num[indexToRead]!= 0){
             fixed [indexToStore] = num[indexToRead];
             indexToStore++;
            }
            indexToRead++;
        }
        System.out.println(Arrays.toString(fixed));
    }
}
