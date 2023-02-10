package day10_if_statements.homework;

import java.util.Scanner;

public class Diver {
    /*
    create a class Diver
You are diving in the ocean. Your oxygen tank has a certain level (number)
declare and assign a int variable about the oxygen level in the tank and
print a message based on the oxygen level:
Above 90 - Your tank is full
Above 80 - Still okay
Above 70 - Don't go too far
Above 60 - Start to head back
Above 50 - Be careful now you at at 50%
     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("enter oxygen level of the tank");
        int oxygen = input.nextInt();
        String message;
        if (oxygen >=90){
            message = "Above 90 - Your tank is full";
        }
        else if (oxygen>=80 && oxygen<90){
            message="Above 80 -Still okay";
        }
        else if (oxygen>=70 && oxygen<80) {
            message = "Above 70 -Don't go too far";
        }
        else if (oxygen>=60 && oxygen<70) {
            message = "Above 60 -Start to head back";
        }
        else if (oxygen>=50 && oxygen<60) {
            message = "Above 50 -Be careful now you at at 50%";
        }
        else{
            message = "Under 50 -dangerous";
        }
        System.out.println(message);
    }
}
