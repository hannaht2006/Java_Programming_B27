package Practices.day8;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        /*
        hide password
         */

        ArrayList<String> passwords = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
        ArrayList<String> hiddenPasswords = new ArrayList<>();
        //get the word one by one

        for (String password : passwords) {


            //hide the password with * =
            String hiddenPassword = hiddenPassword(password, '*');
            //put the hidden password in other list
            hiddenPasswords.add(hiddenPassword);

        }
        System.out.println("HiddenPasswords = " + hiddenPasswords);
    }
        private static String hiddenPassword(String password, char c){
            String hiddenPassword ="";
            for (int i = 0; i < hiddenPassword.length(); i++){
                hiddenPassword += c;
            }
        return hiddenPassword;
    }
}
