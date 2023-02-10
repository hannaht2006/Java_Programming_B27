package Practices;
import java.util.Scanner;
public class PracticeScanner1 {
    /*
    Create a program that will ask the user to enter two numbers. Add the numbers and print the result
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter number 1 : ");
        int number1 = input.nextInt ();
        System.out.println("Enter number 2 : ");
        int number2 = input. nextInt();
        int total = number1 + number2;
        System.out.println("Total = "+ total);






    }
}
