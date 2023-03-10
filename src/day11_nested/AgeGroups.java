package day11_nested;

public class AgeGroups {
    public static void main(String[] args) {
        /*
        age should be between 0-120
        <1 baby
        2-5 toddler
        6-13 kid
        13-18 young adult
        19-30 adult
        31-65 middle age adult
        > 65 senior

         */
        int age = 140;
        if (age >= 0 && age <= 120) {// precondition to check for valid ages only
            // valid ages
            if (age <= 1) {
                System.out.println("baby");
            } else if (age <= 5) {
                System.out.println(" Toddler");
            } else if (age <= 13) {
                System.out.println("Kid");
            } else if (age <= 18) {
                System.out.println("Teenager");
            } else if (age <= 40) {
                System.out.println("adult");
            } else if (age <= 65) {
                System.out.println(" middle age adult");
            } else {
                // if I am here, the age is between 66-120
                System.out.println(" senior");
            }
        }  else {
           // invalid ages
           if (age <0){
               System.out.println("Age cannot be negative");
           }else{
               System.out.println("Age can not be more than 120");
           }
            }

        }
    }

