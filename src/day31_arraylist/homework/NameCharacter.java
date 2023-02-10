package day31_arraylist.homework;

import java.util.ArrayList;

public class NameCharacter {
    /*
    Create an ArrayList of Characters
Fill the ArrayList with letters of your name. Each letter as a different element
Print each letters on a separate line by accessing each element

     */
    public static void main(String[] args) {

        ArrayList<Character> letters = new ArrayList<>();
        letters.add('H');
        letters.add('A');
        letters.add('N');
        letters.add('N');
        letters.add('A');
        letters.add('H');
        System.out.println(letters.get(0));
        System.out.println(letters.get(1));
        System.out.println(letters.get(2));
        System.out.println(letters.get(3));
        System.out.println(letters.get(4));
        System.out.println(letters.get(5));
        System.out.println(letters);




    }


}
