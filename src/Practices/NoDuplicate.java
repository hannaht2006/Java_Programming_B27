package Practices;

import java.util.Arrays;

public class NoDuplicate {
    public static void main(String[] args) {
        int []nums ={1, 2, 3, 4, 3, 4, 1};//6, 44, 6, 4, 3, 4, 1 - 1, 2, 3, 4, 3, 4, 1
        int []noDup = new int[nums.length];

        for (int i = 0; i<nums.length; i++){
            int count = 0;
            if(noDup[i] != nums[i]){
                for (int j = 0; j< nums.length;j++){
                    if (nums[i] == nums[j]){
                        count++;
                    }
                }
                if (count==1){
                    noDup[i] += nums[i];
                }
            }
        }
        int a = 0;
        for (int each : noDup){
            if (each != 0){
                a=each;
                break;
            }
        }
        System.out.println(a);
        //System.out.println(Arrays.toString(noDup));
}
    }

