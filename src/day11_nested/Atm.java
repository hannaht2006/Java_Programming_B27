package day11_nested;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int validPasscode = 2022;// passcode for login
        System.out.println("Welcome to the ATM. Insert your card and enter your passcode");
        int userPasscode = input.nextInt();// passcode the user input

        if (userPasscode == validPasscode){
            System.out.println("Logged In!\nSelect the option\n\t1)Check Balance\n\t2)Withdraw\n\t3)Deposit");
            int selection = input.nextInt();

            if(selection==1){
                System.out.println("Your balance is: $1,000,000");
            }else if (selection==2){
                System.out.println("How much do you want to withdraw?");
                System.out.println("Withdrawing $"+ input.nextInt());
            }else if (selection==3){
                System.out.println("enter the amount you want to deposit");
                System.out.println(" Depositing $"+ input.nextInt());

            }else{
                System.out.println("Invalid option");
            }

        }else {// this else belong to the if at line 13
            System.out.println("Invalid Passcode");
        }

    }
}
