package day20_loops.homework;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class BiggestString {
    /*
    Biggest substring of matching characters

Given a String find the biggest substring of chars that match and print it.
    Ex:
        Input:
            aaabbbcccccddddee
        Output:
            ccccc
     */
    public static void main(String[] args) {
        String s1 = "", s2="";
        String bStr = "";
        int s1Length = 0, s2Lenght=0;
        int count = 1;
        int biggest =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string of letter:");
        String str = input.next().trim().toLowerCase();

        for (int i = 0; i < str.length() - 1; i++) {
            s1=str.substring(i,i+1);
            s1Length = 1;
            if (str.substring(i+1,i+2).equals(str.substring(i,i+1))){

                s1+= str.substring(i+1, i+2);
                s1Length ++;
                count++;

            }else{
                count =1;
            }
            if (count>biggest){
                biggest = count;
                bStr = s1;
            }


            }
            System.out.print(bStr);

        }

}
