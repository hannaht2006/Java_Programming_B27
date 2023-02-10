package day06_relational_operators;

public class RelationalTasks {

    public static void main(String[] args) {
        /*
        declare a speed variable
        speed limit is 50
        find out if you are speeding
         */
        int currentSpeed = 60;
        int speedLimit = 50;
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("You are speeding = " + isSpeeding);

        /*
        declare a number variable
        find out if the number is positive, negative or zero
         */

        int number = -10;

        boolean positiveNumber = number > 0;
        boolean negativeNumber = number < 0;
        boolean zeroNumber = number == 0;

        System.out.println("positiveNumber = " + positiveNumber);
        System.out.println("negativeNumber = " + negativeNumber);
        System.out.println("zeroNumber = " + zeroNumber);
        /*
        define a number
        find out if it is even or odd
         */

        int num = 5;
        boolean isEven = num % 2 == 0;
        boolean isOdd = num % 2 !=0;// num % 2 == 1 // isEven != true
        System.out.println("isEven = " + isEven);
        System.out.println("isOdd = " + isOdd);





        
    }}
