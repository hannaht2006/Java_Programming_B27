package day23_array;

import java.util.Arrays;
import java.util.Scanner;

public class PartyList {
    /*
    we are throwing a party, we want to gather all the name
     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("How many people are coming to the party?");
        int size = input.nextInt();

        String [] names = new String [size]; // new String[input.nextInt()];
        System.out.println(Arrays.toString(names));

        for (int i = 0; i< names.length; i++){ //purpose: ask the name, and store to the array
            System.out.println("Enter the name of person:" + (i+1)); // if you don't have the PARENTHESIS the line will concatenate left to right, but we want to do addition first (i+1), then concatenate to message
            String guest = input.next();
            names[i] = guest; // names[i] = input.next();
        }
        System.out.println("final list coming to the party");
        System.out.println(Arrays.toString(names));

    }
}
