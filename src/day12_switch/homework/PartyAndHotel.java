package day12_switch.homework;

import java.util.Scanner;

public class PartyAndHotel {
    /*
    Ask the user how many days they will stay at the hotel
Then ask the user how many people are in their party (how many people are staying in the room)

Use those two information to determine the price and room type for the hotel based on the below data:

	party size: 1
	room type: single room
	price: number of days * 100

	party size: 2
	room type: double room
	price: number of days * 125

	party size: 3 or 4
	room type: large room
	price: number of days * number of people * 150

... (10 lines left)
     */
    public static void main(String[] args) {
        String room = "";
        double price = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many days do you want to stay?: ");
        int days = input.nextInt();
        System.out.println("How many people ?:");
        int partySize = input.nextInt();
        switch (partySize) {
            case 1:
                room = "Single room";
                price = 125 * days;
                break;
            case 2:
                room = "Double room";
                price = 100 * days;
                break;
            case 3:
            case 4:
                room = "Large room";
                price = 150 * days * partySize;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                room = "suite room";
                price = 200 * days * partySize;
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
                room = "double suite room";
                price = 300 * days * partySize;
                break;
        }
        if (partySize > 0 && partySize <= 14) {
            System.out.println("Your booking: \n\tRoom type: " + room + "\n\tPrice: " + price + "\n\tnumber of people: " + partySize + "\n\tFor: " + days + " days");
        }else{
            System.out.println("don't have room for your party");
        }
    }
}
