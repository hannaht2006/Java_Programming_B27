package day28_methods.homework;

public class ReturnSum {
    /*
    Create a method that accept an int array. Take the sum of all the numbers and return the sum

     */

    public static void main(String[] args) {
        int []nums = {3, 5, 6, 7, 10};
        int total = sum(nums);
        System.out.println(total);
    }
    public static int sum (int[]nums){
        int sum = 0;
        for(int eachnum :nums){
            sum += eachnum;
        }
        return sum;
    }
}
