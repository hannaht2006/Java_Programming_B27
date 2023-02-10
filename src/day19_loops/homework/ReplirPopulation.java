package day19_loops.homework;

import java.util.Scanner;

public class ReplirPopulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;
        System.out.println("day " + day + " [ " + inhabitants + " ] ");
        while(inhabitants > 1){

            day+= 1;
            inhabitants /= 2;

            System.out.println("day " + day + " [ " + inhabitants + " ] ");

            }

            System.out.println("---- EXTINCT ----");
        }
}
