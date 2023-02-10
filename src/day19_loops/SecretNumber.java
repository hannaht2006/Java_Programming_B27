package day19_loops;

import java.util.Scanner;

public class SecretNumber {
    /*
    write a program that will allow you to guess a secret number.
    Define a number in the code in a specific range, for example 1-100. Then the program is for the user to guess that number
    They will guess a number and get a response. They can keep guessing until they get is right
        give hints:
            number is bigger
            number is smaller

    bonus: keep track of the number of attempts it took to guess the number
     */
    public static void main(String[] args) {

        int secretNumber = 87;
        int inputNum;
        int temp=0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter guess number:");
            inputNum = input.nextInt();

            if (inputNum < secretNumber) {
                System.out.println("number is bigger");
            } else if (inputNum > secretNumber) {
                System.out.println("number is smaller");
            }
           temp++;
        } while (inputNum != secretNumber) ;
            System.out.println("you guessed the number in "+temp+" attempts");
        }
    }

