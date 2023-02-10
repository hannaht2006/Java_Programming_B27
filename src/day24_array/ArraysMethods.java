package day24_array;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {

        int [] nums = {32, 5, -9, 3, 2, 1, 20};
        System.out.println(Arrays.toString(nums));

        System.out.println("--------------");

        Arrays.sort(nums);// don't need to assign sort()
        System.out.println(Arrays.toString(nums));//--> [-9, 1, 2, 3, 5, 20, 32]

        // max & min
        System.out.println("Min: "+ nums[0]);
        System.out.println("Max: "+ nums[nums.length-1]);
        System.out.println("------------------");

        // sort with String
        String [] strs = {"Hello", "world", "4four","abc", "#Zebra", "apple", "1aaaa"};
        System.out.println(Arrays.toString(strs));//-->[Hello, world, 4four, abc, #Zebra, apple, 1aaaa]
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));//-->[#Zebra, 1aaaa, 4four, Hello, abc, apple, world] ; sort with ascii order: Special character, number, uppercase, lowercase

        System.out.println("----------------");
        int []a = {1, 2, 3};
        int []b = {1, 2, 3};
        int []c = {1, 2, 4};
        int []d = {3, 2, 1};

        System.out.println(Arrays.equals(a,b));//---> true so a equal b
        System.out.println(Arrays.equals(a,c));// --> false
        System.out.println(Arrays.equals(a,d));//--> false
        Arrays.sort(d);
        System.out.println(Arrays.equals(a,d));//---> true (after sort(d))
    }
}
