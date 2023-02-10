package day11_nested;

public class ArmyQualification {
    public static void main(String[] args) {
        /*
        age : 18-35
        high school diplomat
        citizen

        in our program we check if you are eligible and show the message if you are, but then if you are not we go through 3 if statements to check the reason why. they are separate if statements that check about the age, diploma and citizen
         */

        int age = 20;
        boolean hasDiploma = false;
        boolean isCitizen = true;

        if((age>=18 && age <=35) && hasDiploma && isCitizen){
            System.out.println("You Qualify for Army");
        }else{
            // multi branch to check information about age
            if (age<0 || age > 120){
                System.out.println("Not a valid age");
            }else if (age < 18){
                System.out.println("You are too young, need to be at least 18");
            }else if (age >35){
                System.out.println("You are too old, limit is 35 years old");

            }
            // if to check about diploma
            if (!hasDiploma){// if you don't have a diploma
                System.out.println("You need at lease a high school diploma");
            }
            // if to check about citizen
            if (!isCitizen){
                System.out.println(" You need to be a citizen to apply");
            }
        }// end of the else for qualification
    }// end of the main method
}// end of the class
