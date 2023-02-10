package Practices;

import java.util.Scanner;

public class PracticeScanner3 {
    /*
    Create a program that will ask the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter angle 1: ");
        float angle1 = input.nextFloat();
        System.out.println("Enter angle 2: ");
        float angle2 = input.nextFloat();
        System.out.println("Enter angle 3: ");
        float angle3 = input.nextFloat ();

        Float totalAngle = angle1+angle2+angle3;
        boolean isTriangle = totalAngle == 180;
        boolean isCircle = totalAngle == 360;

        System.out.println("Total angle = "+totalAngle);
        System.out.println("this is triangle : " +isTriangle);
        System.out.println("This is Circle : "+ isCircle);




    }
}
