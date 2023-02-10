package Practices;

import java.util.Scanner;

public class Homework6 {
    /*

create a number to represent the day. (1 being Monday and 7 being Sunday)
Print the day related to the number

	Ex
		2
		Tuesday

	Ex:
		5
		Friday
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter number from 1 to 7 :");
        int num = input.nextInt();

        if(num==1){
            System.out.println("monday");

        }if(num==2){
            System.out.println("tuesday");
        }
        if(num==3){
            System.out.println("Wednesday");

        }if(num==4){
            System.out.println("Thursday");

        }if(num==5){
            System.out.println("Friday");
        }
        if(num==6){
            System.out.println("Saturday");
        }
        if(num==7){
            System.out.println("Sunday");
        }


    }
}
