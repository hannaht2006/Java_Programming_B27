package day20_loops.homework;

import java.util.Scanner;

public class Syllables {
    /*
    Syllables
    Given a String separated by dashes calculate how many syllables the words are
        Ex:
            Input:
                ja-va
            Output:
                2
     */
    public static void main(String[] args) {
        String str ="";
        String s1 = "";
        String s2 ="";
        int count=0;
        int dashIndex;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a word separated by dash:");
        str = input.next().trim().toLowerCase();

        dashIndex= str.indexOf('-');
        s1 = str.substring(0,dashIndex);
        s2 = str.substring(dashIndex+1,str.length());
        //System.out.println(s1);
        //System.out.println(s2);

       for (int i=0; i<s1.length();i++){
            if (s2.contains(s1.substring(0,i+1))){
               count +=2;
            }

        }
        System.out.println(count);

    }
}
