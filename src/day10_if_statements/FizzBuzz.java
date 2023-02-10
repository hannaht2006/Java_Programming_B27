package day10_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    /*
    [IQ] Given a number n, print the output based on the following conditions:
    the number if divisible by 3 print Fizz
     the number if divisible by 5 print Buzz
     the number if divisible by 3 and 5 print FizzBuzz
     the number is not divisible by any the print just the  number
     ex:
     n=10
     Buzz
     n= 12
     Fizz
     n=15
     FizzBuzz
     n=1
     1

     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number: ");

        int n=input.nextInt();
        String text = "";

        boolean isDivisibleBy3 = n % 3 == 0;
        boolean isDivisibleBy5 = n % 5 == 0;
        boolean isDivisibleBy3And5 = isDivisibleBy3 && isDivisibleBy5;

        if (isDivisibleBy3And5){
            text = "FizzBuzz";

        }else if (isDivisibleBy3){
            text = "Fizz";

        }else if (isDivisibleBy5){
            text = "Buzz";
        }else{
            System.out.println(n);
        }
        System.out.println(text);
    }
}/*
int n =4;
if (n % 3 ==0 && n % 5 == 0) {
System.out.println ("FizzBuzz");
} else if (n % 3 == 0) {
System.out.println ("Fizz");
}else if (n % 5 == 0) {
System.out.println ("Buzz");
}else {
System.out.println (n);
}
*/
