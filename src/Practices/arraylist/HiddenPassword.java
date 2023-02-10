package Practices.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class HiddenPassword {
    public static void main(String[] args) {

    /*
    hide password
     */

        //get the password one by one
        ArrayList<String> passwords = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
        ArrayList <String> hidenPasswords = new ArrayList<>();
        //hide the password with *
        for (String password : passwords) {
        String hidenPassword = hidePassword(password, '*');

//put the password to other list
            hidenPasswords.add(hidenPassword);
        }
        System.out.println(hidenPasswords);
    }

    private static String hidePassword(String password, char c) {
        String hiddenPassword ="";
        for(int i = 0; i<password.length(); i++){
            hiddenPassword += c;
        }
        return hiddenPassword;
    }
}
