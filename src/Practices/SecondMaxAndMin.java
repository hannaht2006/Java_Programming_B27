package Practices;

import java.util.*;

public class SecondMaxAndMin {
    public static void main(String[] args) {

        int[] nums = {5, 8, 1, 10,4, 8, 11, 7, 40, 22, 11};
        Set <Integer> newNums = new TreeSet<>();
        for(Integer each : nums){
            newNums.add(each);
        }
        System.out.println(newNums);
       Object[] temp = newNums.toArray();
       Object [] finalResult = {temp[1], temp[temp.length-2] };
        System.out.println(Arrays.toString(finalResult));

    }
}
