package day19_loops.homework;

import java.util.Scanner;

public class FindUppercase {
    /*
    Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
	Ex:
		Input:
			2juMp41EEkd4s4
		Output:
			3 uppercase letters
			6 lowercase letters
			5 numbers
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String s="";
        int len;
        int up=0,lo=0,nu=0;
        System.out.println("Enter a string of letter and number:");
            s= input.next().trim();
            len = s.length();
        for (int i = 0; i < len; i++)  {

            if (s.charAt(i) >= 65 && s.charAt(i) <= 90){
                up +=1;
            }else if (s.charAt(i) >= 97 && s.charAt(i) <= 122){
                lo +=1;
            }else{
                nu +=1;
            }
        }
        System.out.println(up + " uppercase letters");
        System.out.println(lo + " lowercase letters");
        System.out.println(nu + " numbers");

    }
}
