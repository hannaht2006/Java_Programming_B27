package Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNoDuplicate {
    public static void main(String[] args) {
        /*
        program to remove duplicate items from an array (ignore case sensitivity).
Sample Input: [ 'test', '2', '2', '4', '5', '4', 'tEst', 'TEST', '7', '3', '6' ]
Sample Output: [ '2', '3', '4', '5', '6', '7', 'test' ]
         */
        String[] lists = {"test", "2", "2", "4", "5", "4", "tEst", "TEST", "7", "3", "6"};
        Arrays.sort(lists);
//       String[] newList = new String [lists.length];
//       for(int i=0; i< lists.length; i++){
//           newList[i]=lists[i].toLowerCase();
//       }
//        System.out.println(Arrays.toString(newList));

        List<String> noDup = new ArrayList<>();
        for (String each:lists){
          String s = each.toLowerCase();
            if(!noDup.contains(s)){
                noDup.add(s);

            }
        }
        System.out.println(noDup);
    }
}
