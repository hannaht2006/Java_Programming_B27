package Practices;

import java.util.Scanner;

public class PracticeScanner4 {
    /*
    Create a program that will ask the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values

    Ex:
    Enter a number
    65

    65 is divisible by 2: false
    65 is divisible by 3: false
    65 is divisible by 5: true
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();

        boolean isDivisibleBy2 = number%2==0;
        boolean isDivisibleBy3 = number%3==0;
        boolean isDivisibleBy5 = number%5==0;
        System.out.println(number+" is divisible by 2: " +isDivisibleBy2);
        System.out.println(number+" is divisible by 3: " +isDivisibleBy3);
        System.out.println(number+" is divisible by 5: " +isDivisibleBy5);

    }
}
