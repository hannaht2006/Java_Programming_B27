package day15_string;

public class StringMethods2 {
    public static void main(String[] args) {

        String word ="java";
        System.out.println(word.startsWith("j"));//return boolean --> true
        System.out.println(word.startsWith("ja"));
        System.out.println(word.startsWith("jae"));//--> false

        System.out.println("----------------------");

        System.out.println(word.endsWith("a"));
        System.out.println(word.endsWith("A"));
        System.out.println(word.endsWith("java"));
        System.out.println(word.endsWith("va "));

        System.out.println("---------------");

        boolean b = word.endsWith("hello"); // method returns boolean so we can also declare a boolean variable

        String s = " hello world today";
        System.out.println(s.startsWith("hello world"));

        System.out.println("---------------");


        String str = " today it is 80 degrees";
        System.out.println("str.contains(today)) "+str.contains("today"));
        System.out.println("str.contains(it is)) "+str.contains("it is"));
        System.out.println("str.contains(degrees)) "+str.contains("degrees"));
        System.out.println("str.contains(it 80)) exact sequence "+str.contains("it 80"));
        System.out.println(str.contains("80") && str.contains ("today"));//contains (it) && contains (80)
        // contains (str) return boolean


    }
}
