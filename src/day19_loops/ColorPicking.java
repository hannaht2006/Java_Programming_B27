package day19_loops;

import java.util.Scanner;

public class ColorPicking {
    /*
    write a program that will allow the user to select three colors for the painting. There needs to be 3 unique colors selected

     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int numberOfColor =0;
        String colors = "";

        while (numberOfColor<3){

            System.out.println("Enter the color:");
            String inputColor = input.nextLine().toLowerCase();

            if(!colors.contains(inputColor)){//if the color is unique, color String does not have the value already had
                colors += " "+inputColor;
                numberOfColor++;
            }
        }
        System.out.println(colors.trim());
    }
}
