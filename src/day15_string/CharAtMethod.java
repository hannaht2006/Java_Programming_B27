package day15_string;

public class CharAtMethod {

    public static void main(String[] args) {

        String s = "java";
        //          0123
        System.out.println("first character: " +s.charAt(0));
        System.out.println("second character: " +s.charAt(1));
        System.out.println("third character: " +s.charAt(2));
        System.out.println("fourth character: " +s.charAt(3));// s.charAt(s.length()-1)

        // System.out.println("invalid character :"+ s.charAt(100)); 100 is not a valid index in the String

        System.out.println("length "+ s.length());
        System.out.println("last index : "+(s.length()-1)); // length -1 to find the last index

        System.out.println("--------------------------");

        // reverse my String, hardcoded : goal is to see : "avaj"
        System.out.print(s.charAt(3));
        System.out.print(s.charAt(2));
        System.out.print(s.charAt(1));
        System.out.print(s.charAt(0));
        System.out.println( );

        System.out.println(s.charAt(0)+s.charAt(1) + s.charAt(2)+s.charAt(3));// this is addition --> add value of the characters together --> return a number
        // make String character by add "" at the beginning:
        System.out.println(""+s.charAt(0)+s.charAt(1) + s.charAt(2)+s.charAt(3));

    }
}
