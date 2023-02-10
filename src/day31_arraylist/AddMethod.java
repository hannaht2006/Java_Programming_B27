package day31_arraylist;

import java.util.ArrayList;

public class AddMethod {

    public static void main(String[] args) {
        ArrayList <Character> letters = new ArrayList <>();//create an empty ArrayList
        System.out.println(letters.size());// -->0 --> empty
        letters.add ('j');
        letters.add ('a');
        letters.add ('v');
        letters.add ('z');
        System.out.println(letters);//-->[j, a, v, z]
        System.out.println(letters.size());//--> 4 : number of elements

        // reading from array : arrayName[index]

        // reading elements from the ArrayList
        System.out.println(letters.get(0));
        System.out.println(letters.get(1));
        System.out.println(letters.get(2));
        System.out.println(letters.get(3));

        letters.add(0, '$');
        System.out.println(letters);//-->[$, j, a, v, z]
        System.out.println(letters.get(1));//--> j

        letters.add(3, '8');
        System.out.println(letters);//-->[$, j, a, 8, v, z]



    }
}
