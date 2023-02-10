package Practices;

import java.util.Arrays;

public class
TestHw {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4};

        int[] dNums = new int[2 * (nums.length)];

        for (int i = 0, y = 0; i < nums.length; y++, i++) {
            dNums[y] = nums[i];

        }
        System.out.println(Arrays.toString(dNums));
    }
}
