package day19_loops.homework;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ReverseSecondWord {
    /*
    Reverse only second word

Given a String with three words separated by spaces. Reverse only the second word and return the modified String
	Ex:
	I love java

	Ouput:
	I evol java
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String s ="";
        String reverse="";
        int len;
        System.out.println("enter three words separated by spaces: ");
        s = input.nextLine().trim();
        len = s.length();
        int spIndex1 = s.indexOf(" ");
        int spIndex2 = s.lastIndexOf(" ");
        String s1= s.substring(0,spIndex1);
        String s2 = s.substring(spIndex2+1);

        for (int i = spIndex2-1; i >= spIndex1+1; i--){
            reverse+= s.charAt(i);
        }
        System.out.println(s1+" "+reverse+" "+s2);
    }
}
