package day16_string.homework;

import java.util.Scanner;

public class Id {
    /*
    [Create ID]

Given a first name and last name create and return an id using the following format:
    the first letter of the first name as lowercase,
    the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
    the length of the first String multiplied by 2

    first name: john
    last name: smith

    id: jSmi8
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter first name:");
        String firstN = input.next().toLowerCase();
        System.out.println("enter last name:");
        String lastN = input.next().toLowerCase();
        String lastN1 = lastN.toUpperCase();

        int len = firstN.length()*2;

        System.out.println("id: "+firstN.charAt(0)+lastN1.charAt(0)+lastN.substring(1,3)+len);

    }
}
