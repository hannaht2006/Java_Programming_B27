package day13_switch_string;

public class StringObject {
    public static void main(String[] args) {

        String s = "first"; // String literal, in the String pool
        String s2 = new String ("second");// object in the heap
        System.out.println(s==s2);//false--> compares two different objects

        String s3 = new String ("first");
        System.out.println(s==s3); // false--> compares objects in different location

        String s4 ="second";
        System.out.println(s==s4);//false -->compares objects in different

        String s5 = "first";
        System.out.println(s==s5);// true ---> compare to the same object, same address
    }
}
