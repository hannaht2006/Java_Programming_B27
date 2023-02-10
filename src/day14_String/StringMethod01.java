package day14_String;

import jdk.swing.interop.SwingInterOpUtils;

public class StringMethod01 {
    public static void main(String[] args) {

        String item = "pen";// in String pool
        String item2 = new String("pen");// in heap
        System.out.println(item == item2); //check if the object item is the same item2 --> false
        String item3 = new String("pen");
        System.out.println(item2 == item3);// compares the two object. they are both in the heap, but not the same object. --> false
        // .equals() : compare the value of the Strings, which checks if the characters are the same
        System.out.println("--------------------------");
        System.out.println(item.equals(item2)); //--> true,
        System.out.println(item2.equals(item3));// --> true
        System.out.println(item3.equals("pen"));
        System.out.println(item.equals("Pen"));//check for exact characters including cases --> false
        System.out.println(item.equalsIgnoreCase("Pen"));// check for matching characters and ignores all the cases --> true
        System.out.println("-------------------");
        String username = "jamesbond";
        String password = "BOND007";
        //System.out.println(username.equals("jamesbond"));
        System.out.println(username.equalsIgnoreCase("JAMESBOND"));
        System.out.println(password.equals("bond007"));//false because not the same character (lowercase)
        System.out.println("-------------------");

        String day ="Tuesday";
        System.out.println(day.length());// count how many characters there is
        String day2 = "Friday";
        int len = day2.length();//length method give back int type, se we can use it however we want
        System.out.println(len);

        String str = " hello ";// spaces also are counted as character
        System.out.println(str.length());//print how many character the String has, not the String ---> 7

        System.out.println(str);
        System.out.println("-------------------");

        String word = "Summer";
        System.out.println(word.toLowerCase());
        word.toUpperCase();// the toUpperCase method makes all the character uppercase,  but we didn't do anything with this value
        System.out.println(word);

        word = word.toUpperCase();// now, we make all characters uppercase, then the String gives us back (all uppercase), we reassigned into the variable
        System.out.println(word);
        System.out.println("-------------------");

        String sentence = " hello My name IS Hannah";
        System.out.println(sentence.toLowerCase());// make a new String that was all lowercase, and then printed it
        System.out.println(sentence);// print the original String, because String is immutable it cannot change

        String lowerVer = sentence.toLowerCase();
        // option 3: reassign
        // sentence = sentence.toLowerCase();
        System.out.println("-------------------");

        String s = "     java    ";
        System.out.println(s.length());
        s = s.trim();// trim method gets rid of all the extra spaces in thr beginning and end of the String
        System.out.println(s);
        System.out.println(s.length());

        String s2 = "   multiple words here      ";
        System.out.println(s2.trim());// trim() will remove from beginning and end; middle spaces will not be touched.




    }
}
