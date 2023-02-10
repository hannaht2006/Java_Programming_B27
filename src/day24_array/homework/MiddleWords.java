package day24_array.homework;

import java.util.Arrays;

public class MiddleWords {
    /*
     Given a String array:

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
                };
Find and print all the middle character
     */
    public static void main(String[] args) {
        String[] countries = {"Brazil","China","Cuba","Sweden","France", "Vietnam","Albania","Portugal","Philippines","Armenia", "Colombia","Honduras","Indonesia","United States"};
        String middleWords = "";
        for (String each:countries ) {
            System.out.println(each);
            String eachMiddle = "";
            for (int i = 1; i < each.length()-1; i++) {
                eachMiddle += each.charAt(i);
            }
            middleWords += eachMiddle + " ";
        }
        String [] mW = middleWords.split(" ");
        System.out.println(Arrays.toString(mW));

        }
    }


