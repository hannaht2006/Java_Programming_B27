package day10_if_statements.homework;

import java.util.Scanner;

public class Retake {
    /*
    create a class Retake
declare and assign a grade variable
declare and assign an attempt number
Doing a retake for the assignment will reduce the grade by a percentage
based on the number of attempts taken:
If its the first attempt -> subtract 10%
If its the second attempt -> subtract 20%
If its the third attempt -> subtract 35%
Based on the retake attempt number calculate the final grade
     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter student retake grade:");
        double grade= input.nextDouble();
        System.out.println("Enter number of attempt:");
        int attempt=input.nextInt();

        double finalGrade = 0.0;

        if (attempt==1){
            finalGrade = grade*90/100;
        }
        else if (attempt ==2){
            finalGrade = grade *80/100;
        }
        else if (attempt ==3){
            finalGrade = grade*65/100;
        }
        else {
            System.out.println("enter wrong information");
        }
        System.out.println("Your final grade: " +finalGrade);
    }
}
