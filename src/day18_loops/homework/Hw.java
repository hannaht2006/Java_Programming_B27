package day18_loops.homework;

import java.util.Scanner;

public class Hw {
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
        int secretNum = 50;
        int num=0;
        int attemp = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter 2 digits number:");
             num = input.nextInt();
            attemp++;
            if (num > secretNum){
                System.out.println("your number id greater than secret number, try again");
            }else if (num == secretNum){
                System.out.println("your number is the secret number");
            }else{
                System.out.println("your number is less than the secret number");
            }

        }while (num != secretNum);

        System.out.println("your attempt times : "+ attemp);

    }
}
