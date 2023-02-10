package day21_nested_loops;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacter {
    /*
    java
    given a string find all the unique characters
    (only appears in the String once)

    output : jv
     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("enter a word:");
        String str = input.next();
        String s = "";

        for (int i = 0; i < str.length(); i++){
            int count = 0;

            for (int j = 0; j < str.length(); j++){

                if (str.charAt(i)== str.charAt(j)){

                    count++;
                }
            }
            if (count ==1) // if the count is 1 the character was only found 1 time, the character only matched itself. if statement in the outer loop
            System.out.print(str.charAt(i) );// should put print in the outer loop
        }

        String [] word = {"hannah", "banana", "car", "banana"};

        Set<String> unique = new HashSet<>();
        for(String each : word){
            unique.add(each);
        }
        System.out.println(unique);
    }
}
/*
Scanner input = new Scanner (System.in);
        System.out.println("enter a word:");
        String str = input.next();
         for (int i = 0; i < str.length(); i++){
           int count = 0;
            for (int j = 0; j < str.length(); j++){

                System.out.println(str.charAt(i)+ "--->"+ str.charAt(j));
 */