package day31_arraylist.homework;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;

public class TryLoop {
   /*
    Try to loop:

    Create an ArrayList of Characters
    Fill the ArrayList with letters from a-z
    Print the ArrayList of all the characters

    Manually remove each vowels A, E, I, O, U and print the new ArrayList
      */

   public static void main(String[] args) {
       ArrayList<Character> list = new ArrayList<>();

       for (char i = 'a'; i<='z';i++){
           list.add(i);
       }
       System.out.println(list);
       list.remove((Character)'a');
       list.remove((Character)'e');
       list.remove((Character)'i');
       list.remove((Character)'o');
       list.remove((Character)'u');
       System.out.println(list.remove((Character)'a'));//-> false since the list doesn't have 'a'
       System.out.println(list.remove(4));//-> g

       System.out.println(list);
   }
}
