package day24_array;

import java.util.Arrays;

public class ReveseSentence {
    public static void main(String[] args) {
        String str = " Today is friday. Have a good weekend!";
        // reverse: weekend! good a have friday. is Today
        String []words = str.split(" ");
        System.out.println(Arrays.toString(words));
        String reverse = "";

        for (int i = words.length-1; i >=0 ; i--) {
            reverse += words[i] +" ";

        }
        System.out.println(reverse.trim());
    }
}
