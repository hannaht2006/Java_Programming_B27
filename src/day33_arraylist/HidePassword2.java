package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList <>(Arrays.asList("one", "two", "three", "four"));
        System.out.println(hidenPassword(list));
    }

    public static ArrayList<String> hidenPassword (ArrayList<String>list){

        ArrayList<String>hidden = new ArrayList<>();

        for(String each : list){

            hidden.add(numOfStars(each.length()));
        }
        return hidden;
    }
    public static String numOfStars (int length){
        String stars ="";
        for (int i =0; i<length;i++){
            stars += "*";

        }
        return stars;
    }
}
/*
original virsion:

public static ArrayList<String>hidenPassword (ArrayList<String>list){

        ArrayList<String>hidden = new ArrayList<>();

        for(String each : list){
            String stars ="";
            for (int i =0; i<each.length();i++){
                stars += "*";

            }
            hidden.add(stars);
        }
        return hidden;
    }
 */
