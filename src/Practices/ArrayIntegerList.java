package Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayIntegerList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 4, 7,9,4, 6,8));
        Collections.sort(nums);
        int misNum = 0;
        int dupNum = 0;
        for (int i =0; i<nums.size()-1; i++){
            if(nums.get(i)==nums.get(i+1)){
                 dupNum =nums.get(i);
            }
            if(nums.get(i)+2==nums.get(i+1)){
                misNum = nums.get(i)+1;
            }
        }
        System.out.println(dupNum);
        System.out.println(misNum);
    }

}
