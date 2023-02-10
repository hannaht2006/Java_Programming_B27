package day05_arithmetic_operators;

public class KgToPound {
    /*

 create a class called KgTopounds, and write a program that can convert Kg to pound and print the result
            Ex:
                kg = 10;
                output:
                    10 kg equal to 22.0462 pounds
                kg = 20
                output:
                    20 kg equal to 44.0924 pounds
                ....
            Hint: 1kg = 2.20462 pounds
     */
    public static void main(String[] args) {

        float kg = 1.0F;
        float bl = 2.20462F;
        float kgToPound = kg*bl;
        System.out.println("1 kg = " + kgToPound+ " bl");

        float kg1 = 10.0F;
        float bl1 = 2.20462F;
        float kgToPound1 = kg1*bl1;
        System.out.println(kg1 +"kg = " + kgToPound1+ " bl");
        kg1+=10;
        float kgToPound2=kg1*bl1;
        System.out.println(kg1+ "kg = "+kgToPound2 + " bl");


    }
}
