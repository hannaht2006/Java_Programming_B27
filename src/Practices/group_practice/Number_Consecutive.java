package Practices.group_practice;

import java.util.Scanner;

public class Number_Consecutive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive int number: ");

        int n = input.nextInt();

        for(int i = 1; i<=n; i++){

            checkNumber(i);

            }

    }
    public static void checkNumber(int num){
        String s1 = "Codility";
        String s2 = "Test";
        String s3 = "Coders";

        if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0) {
            System.out.println(s1+s2+s3);
        }else if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(s2+s3);
        }else if(num % 2 == 0 && num % 5 == 0) {
            System.out.println(s1+s3);
        }else if(num % 2 == 0 && num % 3 == 0) {
            System.out.println(s1+s2);
        }else if (num % 5 == 0) {
            System.out.println(s3);
        }else if (num % 3 == 0) {
            System.out.println(s2);
        }else if (num % 2 == 0) {
            System.out.println(s1);
        }else {
            System.out.println(num);
        }

    }
}

/*
6.Write a function:

that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
 */
