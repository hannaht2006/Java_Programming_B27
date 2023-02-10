package day28_methods.homework;

public class ContainNumber {
    /*
create a method that will accept an int array and an int number. Check and return if the given number is in the array.
     */
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 4};
        int n = 3;
        System.out.println(containNumber(nums,n));
    }
        public static boolean containNumber(int []nums , int n){
        int count = 0;
        boolean result = false;
        for (int each :nums){
            if (each == n){
                count++;
            }
            if (count != 0){
                result = true;
            }else{
                result = false;
            }
        }
        return result;
    }
}
