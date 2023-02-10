package day19_loops.homework;

import java.util.Scanner;

public class PrimeNumber {
    /*
    [IQ] Prime number

Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

Ex:
	Input:
		11
	Output:
		prime

Ex:
	Input:
		10
	Output:
		not prime
     */
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner (System.in);

        System.out.println("Enter a number:");
         num = input.nextInt();
        if (num%num==0 && num %1 ==0){
            System.out.println(" prime");
        }else {
            System.out.println("not prime");
        }
    }
}
