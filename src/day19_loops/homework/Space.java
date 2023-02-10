package day19_loops.homework;

import java.util.Scanner;

public class Space {
    /*
    Space program

Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore

	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String msg = "";
        String newMsg;
        System.out.println("Enter your message:");
        msg = input.nextLine().trim();

            msg =msg.replace(' ', '_');

        for ( int i = 0; i < msg.length();i++){
            System.out.print(msg.charAt(i) +" ");

        }


    }
}
