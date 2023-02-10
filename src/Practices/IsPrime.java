package Practices;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        boolean isPrimeNum = false;
        int count = 0;

        if (num < 2) {
            isPrimeNum = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
                if (count ==0){
                    isPrimeNum = true;
                }else{
                    isPrimeNum = false;
                }
        }
        System.out.println("Number "+num + " is prime: " + isPrimeNum);
    }
}
