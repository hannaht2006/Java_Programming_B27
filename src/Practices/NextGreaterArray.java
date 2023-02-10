package Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextGreaterArray {
    public static void main(String[] args) {
        int[] nums= {10, 3, 2, 4};
        int[] num1 = Arrays.copyOf(nums, nums.length+1);

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i< num1.length-1; i++){
            int count =0;

            for(int j =i; j< num1.length-1; j++){
                if(num1[i] < num1[j+1]){

                    count++;
                    result.add(num1[j+1]);

                    break;
                }
                if(count>0){
                    break;
            }

            }
            if(count ==0){
                result.add(-1);

            }
        }
        System.out.println(result);
    }
}
