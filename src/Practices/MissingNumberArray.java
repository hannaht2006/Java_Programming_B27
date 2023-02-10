package Practices;



import java.util.Arrays;

public class MissingNumberArray {
    /*
    Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
     */
    public static void main(String[] args) {

        int[] nums= {6,1,2,8,3,4,7,10,5};
        Arrays.sort(nums);
        int[] numTemp = Arrays.copyOf(nums, nums.length+2);
        System.out.println(Arrays.toString(numTemp));
        for (int i=0; i< nums.length; i++){
            int temp =0;
            if (numTemp[i+1] == numTemp[i]+2) {
                temp=numTemp[i] +1 ;
                System.out.println(temp);
            }
        }

    }
}
