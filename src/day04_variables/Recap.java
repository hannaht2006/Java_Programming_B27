package day04_variables;

public class Recap {
    public static void main(String[] args) {

        // declare variables
        double temperature;
        byte numberOfJavaDays;
        short numberOfSoftSkillsDays;

        //assigning value to variables
        temperature = 74.2;
        numberOfJavaDays = 4;
        numberOfSoftSkillsDays = 2;

        System.out.println("temperature = " + temperature +" F");
        System.out.println("numberOfJavaDays = " + numberOfJavaDays +" days");
        System.out.println("numberOfSoftSkillsDays = " + numberOfSoftSkillsDays + " days");

        //declare and assign at same time

        int numberCoffeeCups = 2;
        float ratingOfMovie = 8.9F; //compiler takes 8.9 as double type, we add F at the end to make it the float type
        long waterAndOcean = 20_000_000_000_000L; //compiler take 20000000000000 as int type, but this number is too big for int, so doesn't compile, we need to add L to make it a long type
        System.out.println("numberCoffeeCups = " + numberCoffeeCups);
        System.out.println("ratingOfMovie = " + ratingOfMovie);
        System.out.println("waterAndOcean = " + waterAndOcean + " liters");






    }


}
