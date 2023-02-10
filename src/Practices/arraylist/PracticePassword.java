package Practices.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticePassword {
    public static void main(String[] args) {
        String s = "one, two, three";

        ArrayList<String> s1 = new ArrayList<>(Arrays.asList(s.split(", ")));
        System.out.println(s1);
        ArrayList<String> newPw = new ArrayList<>();
        String hiddenPw ="";
        for(String each :s1){
           hiddenPw = hiddenPassword(each, '*');
            newPw.add(hiddenPw);
        }

        System.out.println(newPw);
    }

    private static String hiddenPassword(String each, char c) {
        String password = "";
        for(int i=0; i< each.length();i++){
            password +=""+ '*';
        }
       return password;
    }
}
