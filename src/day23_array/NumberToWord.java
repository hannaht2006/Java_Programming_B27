package day23_array;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number from 0 to 15 to see the number in word");
        int num = input.nextInt();

        String [] numWord ={"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen"};

        if (num>=0 && num <=15){
            System.out.println(numWord[num]);

        }else {
            System.out.println("Invalid number. range is 0 to 15");
        }
    }
}
