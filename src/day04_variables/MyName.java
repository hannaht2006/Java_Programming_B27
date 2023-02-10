package day04_variables;

public class MyName {
    /*declare your name as multiple char variables
    print your name, see what happen
     */

    public static void main(String[] args) {

        char first = 'H', second = 'a', third = 'n', fourth = 'h';// char a = 'a', b = 'b', c = 'c';

        System.out.print(first);
        System.out.print(second);
        System.out.print(third);
        System.out.print(third);
        System.out.print(second);
        System.out.println(fourth);

        System.out.println( first +second + third);// no concatenation --> print to number

        System.out.println("My Name : " + first + second + third + third + second + fourth); // concatenate a String in the beginning, this will concatenate all the chars together
        //TODO: 2nd hour of class review later

    }
}
