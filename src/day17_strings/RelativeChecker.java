package day17_strings;

public class RelativeChecker {
    public static void main(String[] args) {

        String name1 =" James bond" ;
        String name2 ="Alex bond";
        name1 = name1.trim();

        int indexOfSpace = name1.indexOf(' ');
        String lastName = name1.substring(indexOfSpace+1);

        if (name2.endsWith(lastName)){

            System.out.println("Related");
        }else{
            System.out.println("Not related");
        }
        System.out.println(name2.endsWith(lastName)? "related" : "not related");
    }
}
