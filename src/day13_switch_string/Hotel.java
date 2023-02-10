package day13_switch_string;

import java.util.Scanner;

public class Hotel {
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

	party size: 5, 6, or 7
	room type: suite
	price: number of days * 5000

	any other party size:
		Display one message:
			Sorry we don't have any available rooms for that size party

     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to the Java Hotel");
        System.out.println("How many days will you be staying?");
        int days = input.nextInt();
        System.out.println("How many people do you have in your party?");
        int people = input.nextInt();
        String roomType ="";
        double price;
        switch(people){
            case 1:
                roomType ="single room";
                price = days*100;
            break;
            case 2:
                roomType ="double room";
                price = days*125;
                break;
            case 3:
            case 4:
                roomType ="large room";
                price = days*150*people;
                break;
            case 5:
            case 6:
            case 7:
                roomType ="suite";
                price = days*5000;
                break;
            default:
                price = 0;

        }
        if(price !=0) {
            System.out.println("Your booking: \n\tRoom type: " + roomType + "\n\tPrice: " + price + "\n\tnumber of people: " + people + "\n\tFor: " + days + " days");
        }else{
            System.out.println("Sorry we don't have any available rooms for that size party");
        }

    }
}
