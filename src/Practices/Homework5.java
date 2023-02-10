package Practices;

import java.util.Scanner;

public class Homework5 {
    /*
    create a char variable letter. Find and print if the character is a letter, number, or special character
	ex: p
		letter
	ex:
		6
		number
	ex:
		$
		speical character
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a single character or number or special character: ");
        char letter = input.next().charAt(0);

        boolean isLetter = (letter>='A'&& letter<='Z') || (letter>='a'&& letter<='z');
        boolean isNumber = (letter>='0'&& letter<='9');
        if (isLetter){
            System.out.println(letter +"\nletter");
        }
        if (isNumber){
            System.out.println(letter +"\nnumber");
        }
        if (!isLetter && !isNumber){
            System.out.println(letter +"\nspecial character");
        }
    }
}
