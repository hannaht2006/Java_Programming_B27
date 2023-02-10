package day15_string;

public class Recap {
    public static void main(String[] args) {
        String first = "Testing";
        first =first.toUpperCase();
        System.out.println(first);

        //or

        String second = "SOFT SKILLS";
        String lowerSecond  = second.toLowerCase();
        System.out.println(lowerSecond);

        // or

        System.out.println(second.toLowerCase());

        System.out.println("-----------------------");

        String third = "  hello   world   ";
        System.out.println(third);
        System.out.println(third.length());
        third = third.trim();
        System.out.println(third.length());
        System.out.println(third);

    }
}
