package day28_methods.homework;

import java.util.Arrays;

public class AddElement {
    /*
Add Element
create a method that will accept an int array and an int number. Return an array with the given number added to the end of the array
*/
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 4};
        int n = 3;
        System.out.println(Arrays.toString(addElement(nums,n)));
   }
    public static int [] addElement(int []nums , int n){
        int [] addNums = Arrays.copyOf(nums, nums.length+1);
        addNums [nums.length] = n;
     //   System.out.println(Arrays.toString (addNums));
       return addNums;
    }
}