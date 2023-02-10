package Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySum {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 7, 5};
        int s = 12;
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i< num.length; i++){
            int sum = 0;
            result = new ArrayList<>();
            for (int j=i; j< num.length; j++){
                sum += num[j];
                result.add(j+1);
                if(sum == s){
                    break;
                }
            }
            if(sum == s){
                break;
            }
        }
        List<Integer> lastList = new ArrayList<>();
        lastList.add(result.get(0));
        lastList.add(result.get(result.size()-1));
        System.out.println(lastList);
    }
}
