package Practices.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        System.out.println("Hello");

      //  throw new ArithmeticException("wrong calculation");//create exception. after this, can not reach the next code line

        System.out.println("enter your age");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if(age<0 || age>130){
            throw new InputMismatchException("invalid age");
        }
        System.out.println("your age:" + age);
    }
}
