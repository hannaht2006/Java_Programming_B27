package day32_arraylist.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class SaparateElement {
    /*
    Separate Parts

Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters

Ex:
str = "ABCD123$%#@&456EFG!"
list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6}
     */
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
        String letter = "", nums = "", special = "";
        for (int i = 0; i< str.length(); i++ ){
            char l = str.charAt(i);
            if (Character.isLetter(l)){
                letter += l;
            } else if (Character.isDigit(l)){
                nums += l ;
            }else {
                special += l;
            }
        }
        ArrayList<String> list1 = new ArrayList(Arrays.asList(letter.split("")));
        ArrayList <String> list2 = new ArrayList (Arrays.asList(nums.split("")));
        ArrayList<String>list3 = new ArrayList (Arrays.asList(special.split("")));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

    }
}
