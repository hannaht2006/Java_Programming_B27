package Practices;

import java.util.Arrays;

public class RemoveSpecialCharsAndReverse {

    public static void main(String[] args) {
        String s = "i love !@ java #45%^";
        String[] s1 = s.split(" ");
        System.out.println(Arrays.toString(s1));

        String temp = "";
        String result ="";
        for (String each : s1) {
            temp="";
            for (int i = each.length()-1; i>=0  ; i--) {
                if (Character.isLetter(each.charAt(i))) {
                    temp += each.charAt(i);
                }

            }
           result += temp +" ";
        }
        System.out.println(result);

        String [] str = result.split(" ");
        int max = 0;
        String longest = "";
        for (String each : str){
            int l = each.length();
            if(l>max){
                max= l;
                longest = each;
            }

        }
        System.out.println(longest);
        System.out.println("------------");

        String s2 = s.replaceAll("[^a-zA-Z]", "");
        System.out.println(s2);


    }
}
