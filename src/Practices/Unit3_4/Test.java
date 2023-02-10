package Practices.Unit3_4;

import java.util.Arrays;

public class Test {
    public static int minNum(int [] nums){
        Arrays.sort(nums);
        return nums[0];

    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 0, 8,};
        int min=minNum (arr);
        System.out.println(min);
    }
}
