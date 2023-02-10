package day32_arraylist.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    /*
    Hide passwords

Given an ArrayList of passwords (String). Hide each password in a star (*) format where each character is a star and print the ArrayList of hidden passwords
Ex:
Input:
{"one", "hi", "hold}

Output:
[ ***, **, **** ]
     */
    public static void main(String[] args) {
        ArrayList<String> password = new ArrayList(Arrays.asList("one", "hi","hold"));
        System.out.println(password);
        String hidePw = "";

        for (int i = 0; i< password.size(); i++){
             String s = password.get(i);
            String hide = "";
            for (int j=0; j< s.length(); j++){
                   hide += '*';
            }
            hidePw += " "+hide;

        }
        System.out.println(Arrays.toString (hidePw.trim().split(" ")));
    }
}
