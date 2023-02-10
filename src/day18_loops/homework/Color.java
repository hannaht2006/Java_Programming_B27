package day18_loops.homework;

import java.util.Scanner;

public class Color {
    /*
    write a program that will allow the user to select three colors for the painting. There needs to be 3 unique colors selected
     */
    public static void main(String[] args) {

        String color1 = "";
        String color2 = "";
        String color3 = "";
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter your first color:");
            color1 = input.next();
            System.out.println("Enter your second color:");
            color2 = input.next();
            System.out.println("Enter your third color:");
            color3 = input.next();
            if (color1.equalsIgnoreCase(color2)  || color1.equalsIgnoreCase(color3) || color2.equalsIgnoreCase(color3)){
                System.out.println("You need to enter 3 different color");
            }

        }while (color1.equalsIgnoreCase(color2)  || color1.equalsIgnoreCase(color3) || color2.equalsIgnoreCase(color3)) ;

        System.out.println("your 3 unique colors : "+color1+", "+color2+", "+color3);
        }

}
