package day23_array;

import kotlin.collections.UArraySortingKt;

import java.util.Arrays;

public class LoopArray {
    public static void main(String[] args) {
        int [] nums = {4, 213, 6};

        //print whole array
        System.out.println(Arrays.toString(nums));

        // print each on a separate line hard coded index
        System.out.println("Hardcoded");
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);

        //print each with for loop
        System.out.println();
        System.out.println("with for loop");

        for (int i =0; i <nums.length; i++){
            System.out.println(nums[i]);
        }
        // create out own printing format:
        String arrayAsString = "Array ~ ";
        for (int i = 0 ; i< nums.length ; i++){
            arrayAsString += nums[i] + " | ";
        }
        arrayAsString += " ~ End";
        System.out.println(arrayAsString);

        // for each loop
        System.out.println("for each loop:");

        for (int eachNumber : nums){ //read every element from the array, beginning to end
            System.out.println(eachNumber); //eachNumber == nums[i] ---> these are the same

        }

    }
}
