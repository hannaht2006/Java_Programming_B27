package day30_practice_wrapper.homework;

public class ValidPassword {
    /*
    Valid Password

    Given a String password find out if it is a valid password

    Requirements:

        Must have at least 8 characters
        Must have at least 1 uppercase letter
        Must have at least 1 lowercase letter
        Must have at least 1 number
        Must have one of the follow special characters:
            ! @ # $ % ^ & *

     */
    public static void main(String[] args) {
        String str = "Java2022!";
        String special = "!@#$%^&*";
        str.trim();
        int countU = 0, countD = 0, countS = 0;

        if (str.length() >= 8) {

            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < special.length(); j++) {

                    if (str.charAt(i) == special.charAt(j)) {
                        countS++;

                    }
                }
            }
            if (countS > 0) {

                for (int k = 0; k < str.length(); k++) {

                    char letter = str.charAt(k);

                    if (Character.isUpperCase(letter)) {

                        countU++;

                    } else if (Character.isDigit(letter)) {

                        countD++;

                    }
                }
                if (countD > 0 && countU > 0) {
                    System.out.println("PW is valid");
                } else {
                    System.out.println("PW is not valid");
                }

            } else {
                System.out.println("PW is not valid");
            }

        } else {
            System.out.println("PW is not valid");
        }
    }
}
