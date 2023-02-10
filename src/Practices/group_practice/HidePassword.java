package Practices.group_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {
        ArrayList<String> password = new ArrayList<>(Arrays.asList("one", "hi", "hold"));

        ArrayList<String> hidenPass = new ArrayList<>();
        
        String hidePassword ="";
        for(String each : password){
            String starts="";
            for(int i=0; i<each.length(); i++){
                starts += "*";
            }

            hidenPass.add(starts);
        }
        System.out.println(hidenPass);
    }
}
