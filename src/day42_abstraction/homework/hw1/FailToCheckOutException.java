package day42_abstraction.homework.hw1;

public class FailToCheckOutException extends Exception{
    /*
     Create a class FailToCheckOutException
    make this a checked exception

    create a constructor to accept the String argument and pass it to the super constructor
     */

            public FailToCheckOutException(){

                super("it is not available to check out ");
        }
}
