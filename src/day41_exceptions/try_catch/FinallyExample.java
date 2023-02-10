package day41_exceptions.try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyExample {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        try{
            System.out.println("enter number 1");
           int num1 = input.nextInt();
            System.out.println("enter number 2");
            int num2 = input.nextInt();

            String s = null;
            s.trim();// create the break point

            System.out.println(num1+num2);
        }catch (InputMismatchException e){
            System.out.println("need to type whole number inputs");
        }finally{// this block of code will always run
            System.out.println("FINALLY RUN");
            input.close(); //closes the Scanner object
        }
    }
}
