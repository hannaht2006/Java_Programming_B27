package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SaparateParts {
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
         ArrayList<String>letters = new ArrayList<>(Arrays.asList(str.split("")));
         letters.removeIf(p-> !Character.isLetter(p.charAt(0)));//p is every element, every element each character of the String, but those characters were String type, so in order to get a char type we did charAt(0). Character methods needed char type

         System.out.println(letters);
         ArrayList<String>numbers = new ArrayList<>(Arrays.asList(str.split("")));
         numbers.removeIf(each -> !Character.isDigit(each.charAt(0)));// to convert String to char we used charAt(0) to read the only element there
         System.out.println(numbers);

         ArrayList<String>special = new ArrayList<>(Arrays.asList(str.split("")));
         special.removeAll(letters);
         special.removeAll(numbers);
         System.out.println(special);



     }
}
