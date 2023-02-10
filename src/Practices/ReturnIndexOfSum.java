package Practices;

import java.util.HashMap;
import java.util.Map;

public class ReturnIndexOfSum {
    public static void main(String[] args) {
        /*
        input:numbers = {1 , 2, 100, 7, 11, 15, 999 };
 target = 9
 output: [1, 3]
find the sum of 2 integer values equal
to 9 and return there indexes
         */

        int [] nums = {1 , 2, 100, 7, 11, 15, 999 };
        int sum = 9;
        Map<Integer, Integer> result = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            for (int j = i+1; j< nums.length; j++){
                int temp = nums[i] + nums[j] ;
                if(temp==sum){
                    result.put(i, j);
                }
            }
        }
        System.out.println(result);
    }
}
