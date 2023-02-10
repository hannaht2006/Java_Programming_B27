package day08_scanner;

import java.util.Scanner;

public class Angles {
    /*
    Create a program that will ask the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
     */


    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter three numbers: ");
        double angle1 = input.nextDouble();
        double angle2 = input.nextDouble();
        double angle3 = input.nextDouble();

        double sum = angle1 + angle2 + angle3;

        boolean isTriangle = sum == 180;
        boolean isCircle = sum == 360;

        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isCircle = " + isCircle);





    }
}
