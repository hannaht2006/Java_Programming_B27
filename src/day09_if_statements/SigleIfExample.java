package day09_if_statements;

public class SigleIfExample {
    public static void main(String[] args) {

        if (true) {
            System.out.println("Hello");// when the boolean is true this will run
        }
        System.out.println("break");// normail print statement, not part of any if

        if (false) {
            System.out.println("Bye");// the boolean was false, this will not run
        }
        System.out.println("-------------------");

        int year = 2020;
        if (year == 2020 || year == 2021) {
            System.out.println("Stay home");
            System.out.println("Wash your hand");
            System.out.println("Social distance");
        }
        System.out.println("-------------------");

        double price = 39.99;

        if (price >= 20) {
            System.out.println("Free shipping");
        }
    }
}
