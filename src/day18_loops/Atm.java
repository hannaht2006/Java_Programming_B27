package day18_loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        int validPin = 1234;
        int userPin;
        int attemps =0;
        Scanner input = new Scanner (System.in);
        // purpose of this loop was to allow reattempts logic

        do{
            System.out.println("Enter your pin");
            userPin= input.nextInt();
            attemps++;

        }while (attemps<=3 && userPin!= validPin);// keep running the loop if the attempt has been less than 3 and the pin is the matching yet

        if (attemps<= 3 && userPin==validPin){
            System.out.println("logged in");
        }else{
            System.out.println("Locked account, too many attempts");
        }

    }
}
