package day19_loops.homework;

import java.util.Scanner;

public class MultiplyEnd {
    /*
    Multiply End

Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times

	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????

	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa
     */
    public static void main(String[] args) {
        String word = "";
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        word = input.next().trim();
        int lenght = word.length();
        int lastIndex = lenght - 1;
        //System.out.println(lastIndex);
        //System.out.println(word.charAt(lenght - 1));
        System.out.println(" Enter a number: ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            word += word.charAt(lastIndex);

        }
        System.out.println(word);

    }
}
