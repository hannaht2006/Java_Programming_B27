package Practices;

import java.util.Scanner;

public class EvenOddZero {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to Cydeo Apartments!");
            System.out.println("How many bedrooms are you looking for?");
            int numberOfBedrooms = scan.nextInt();

            //WRITE YOUR CODE HERE:

            int oneBedroom =1100;
            int twoBedroom = 1850;
            int threeBedroom = 2550;

            if (numberOfBedrooms == 1){
                System.out.println ("One Bedroom Selected \nStarting Price: "+ oneBedroom);

            }
            else if (numberOfBedrooms == 2){
                System.out.println ("Two Bedroom Selected \nStarting Price: "+ twoBedroom);
            }
            else if (numberOfBedrooms == 3){
                System.out.println ("Three Bedroom Selected \nStarting Price: "+ threeBedroom);
            }
            else {
                System.out.println ("Sorry, We do not offer that many bedrooms ");
            }

        }
}