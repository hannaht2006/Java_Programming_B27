package day24_array;

import java.util.Arrays;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = " Today is friday. Have a good weekend!";
        // reverse: yadot si .yadirf evaH a doog !dnekeew
        String []words = str.split(" ");
        System.out.println(Arrays.toString(words));
        String reverse = "";

        for (String each : words){ //go through one element at a time in the array
            System.out.println(each);
         String   eachReverse ="";

        for (int i = each.length()-1; i >=0 ; i--) {
            eachReverse += each.charAt(i)+"";

        }
        reverse += eachReverse + " ";
        }
        System.out.println(reverse);
    }
}
