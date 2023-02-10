package day11_nested.homework;

import java.util.Scanner;

public class MoviePrice {
    /*
    The length of the movie will determine how much it costs.
declare and assign a variable for the duration of the movie
The length will be given as a decimal as hours.minutes
duration of less than or equal to 0:
Movies cannot be less than 0 minutes
duration of more than 4:
Movies cannot be more than 4 hours
for all other duration uses the following values to display the
price of the tickets
duration --> price
1.0 --> 8.99
1.5 --> 10.50
2.0 --> 12.99
2.5 --> 14.50
3, 3.5 or 4 --> 15.99
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the movie duration: ");
        double duration = input.nextDouble();

        if (duration>0 && duration<=4){
            if(duration<=1 && duration>0){
                System.out.println("Price of the ticket is $8.99");
            }
            if(duration<=1.5){
                System.out.println("Price of the ticket is $10.50");
            }
            if(duration<=2){
                System.out.println("Price of the ticket is $12.99");
            }
            if(duration<=2.5){
                System.out.println("Price of the ticket is $14.50");
            }
            if(duration>=3 && duration<=4){
                System.out.println("Price of the ticket is $15.99");
            }


        }else{
            System.out.println("Invalid input");
        }
    }
}
