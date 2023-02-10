package day24_array;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String s = "hello world";
        char [] letters = s.toCharArray();
        System.out.println(letters); //String uses array internally, so it prints as String --> hello world
        System.out.println(Arrays.toString(letters));// --> [h, e, l, l, o,  , w, o, r, l, d]
        System.out.println(letters.length); //--> 11 : number of characters
        System.out.println(s.length());//--> 11 : number of elements
        System.out.println(letters[0]); // --> h

        for (char eachletter : letters){ // :s.toCharArray()
            System.out.println(eachletter);
        }
        System.out.println("------------");

        String str = " monday, tuesday, wednesday, thursday, friday, saturday, sunday";
        System.out.println(Arrays.toString(str.split(",")));

        for (String eachDay :str.split(",") ){
            System.out.println(eachDay);
        }

        System.out.println("----------------------");
        String str2 = "jan-feb-mar-may-jun-jul-aug-sep-oct-nov-dec";
        String []months = str2.split("-");

        for(String eachMonth : months){
            System.out.println(eachMonth);
        }
        System.out.println("----------------------");

        String str3 = "mississippi";
        System.out.println(Arrays.toString(str3.split("si")));// --> [mis, s, ppi]

        String str4 = "java";
        System.out.println(Arrays.toString(str4.toCharArray()));// ---> [j, a, v, a] but this is char[]type

        System.out.println(Arrays.toString(str4.split("")));//---> [j, a, v, a] but this is String [] type
    }
}
