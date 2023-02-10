package day15_string.homework;

import java.util.Scanner;

public class Address {
    /*
    create a class Address
ask the user to enter their address as one input
check which street the house is on and which side of street
handle any extra spaces in the beginning or end of input address
at the end also print the address as all uppercase letters

	houses that have a house number starting with the numbers 500 are on the right side of the street while the address that start with the number 600 are on the left side of the street

	the street they are on is given in the address

		print the street by checking for these streets:

			drive: house on drive

			lane: house on lane

			ave: house on avenue

	Ex:

		Input:
			500312 road w drive, 98404

		Output:
			500312 ROAD W DRIVE, 98404
			house on the right side
			house on drive

	Ex:

		Input:
			600134 South lane, 500415

		Output:
			600134 SOUTH LANE, 500415
			house on the right side
			house on drive
     */
    public static void main(String[] args) {
        String address = "";

        Scanner input = new Scanner (System.in);
        System.out.println("enter your address:");
        address = input.nextLine();
        address = address.trim();
        String addressUppercase = address.toUpperCase();
        System.out.println(addressUppercase);

        boolean right = address.contains("500");
        boolean left = address.contains("600");
        if (right){
            System.out.println("house on the right side");
        }
        if (left){
            System.out.println("house on the left side");
        }


        boolean drive = address.contains("drive")||address.contains("DRIVE")||address.contains("DR")||address.contains("dr");
        boolean lane = address.contains("lane")||address.contains("LANE")||address.contains("ln")||address.contains("LN");
        boolean avenue = address.contains("avenue")||address.contains("AVENUE")||address.contains("ave")||address.contains("AVE");
        if (drive){
            System.out.println("house on drive");
        }
        if (lane){
            System.out.println("house on lane");
        }
        if (avenue){
            System.out.println("house on avenue");
        }

    }
}
