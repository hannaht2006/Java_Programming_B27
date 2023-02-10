package day16_string;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first name :");
        String firstN = input.next().toUpperCase();
        System.out.println("Enter your last name :");
        String lastN = input.next().toUpperCase();

        String initial = ""+ firstN.charAt(0)+ lastN.charAt(0);
        System.out.println("Your initial: "+initial);




    }
}
