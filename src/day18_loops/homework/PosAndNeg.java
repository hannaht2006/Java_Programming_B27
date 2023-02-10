package day18_loops.homework;

import java.util.Scanner;

public class PosAndNeg {
    /*
    write a program that will ask the user to enter 5 numbers and print how many were positive and how many were negative
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time = 0;
        int pos =0;
        int neg =0;
        while (time++ < 5) {
            System.out.println("Enter a number:");
            int num = input.nextInt();
            if (num>0){
                pos+=1;
            }else if (num<0){
                neg+=1;
            }
        }
        System.out.println("positive : "+pos);
        System.out.println("Negative: "+neg);
    }
}
