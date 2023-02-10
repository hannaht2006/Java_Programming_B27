package day05_arithmetic_operators;

public class GalonsToLiters {
    /*
    create a class called GalonsToLiters, and write a program that can convert the gallons to litters
            Ex:
                gallon = 10;
                output:
                    10 gallons equal to 37.8541 liters
                gallon = 20
                 output:
                    20 gallons equal to 75.7082 liters
     */
    public static void main(String[] args) {
        float galons = 1;
        float liters = 3.78541F;
        float galonsToLiters = galons*liters;
        System.out.println(galons+ " galon = "+ galonsToLiters + " liters");
        galons +=9;
        float galonsToLiters1 = galons*liters;
        System.out.println(galons+ " galons = "+ galonsToLiters1 + " liters");

    }
}
