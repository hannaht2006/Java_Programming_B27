package day16_string;

public class SubStringExample {
    public static void main(String[] args) {

        String s = "in_fin@ity";

        String prefix = s.substring(0,2);
        String newStr = s.substring(0+5);

        System.out.println(prefix);
        System.out.println(newStr);

        System.out.println(newStr.contains(prefix));

        System.out.println("--------------------");



        //          01234567
        System.out.println(s.substring(3));

        System.out.println(s.substring(8));// index equal the length of the string ---> return a blank
        System.out.println(s.substring(6));
        //System.out.println(s.substring(9)); index 9 is invalid so stops the program
        System.out.println("-----------------------");
        System.out.println(s.substring(0,3));//s.charAt(0)
        System.out.println(s.substring(2,8));
        System.out.println(s.substring(3,7));
        //System.out.println(s.substring(3,9));// cannot use 8 index here


    }
}
