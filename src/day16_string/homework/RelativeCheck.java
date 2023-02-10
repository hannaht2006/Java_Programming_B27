package day16_string.homework;

import java.util.Scanner;

public class RelativeCheck {
    /*
    [Relative checker]

Given two full names check if the two people are related. They will be considered to be related if they have the same last name

    Input:
        James Bond
        Jamie Bond
    Output:
        Related

    -------------------

    Input:
        James Bond
        Alex Benji
    Output:
        Not Related
     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("enter first full name:");
        String firstN = input.nextLine();
        System.out.println("enter second full name:");
        String secondN = input.nextLine();

        int lastN1 = firstN.indexOf(' ');
        int lastN2 = secondN.indexOf(' ');

        String l1 = firstN.substring(lastN1);
        String l2 = secondN.substring(lastN2);

        if (l1.equalsIgnoreCase(l2)){
            System.out.println("related");
        }else {
            System.out.println("Not related");
        }
    }
}
