package day20_loops.homework;

import java.util.Scanner;

public class RemoveDuplicate {
    /*
    Remove Duplicates
    Write a program that can remove duplicates from a String
        Ex:
            Input: abcabc
            Output: abc

     */
    public static void main(String[] args) {
        String str = "", s = "", s1 = "", s2 = "";
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string of characters:");
        str = input.next().trim();
        s = str;
        for (int i = 0; i < str.length(); i++) {
            s1 = str.substring(i, i + 1);
            s2 = str.substring(i + 1);
            if (s2.contains(s1)) {
                s = s.replaceAll(s1, "") + s1;
            }
        }
        System.out.println(s);
    }
}
