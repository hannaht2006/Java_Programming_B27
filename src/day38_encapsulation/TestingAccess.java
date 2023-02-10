package day38_encapsulation;

public class TestingAccess {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a);//->5
        System.out.println(obj.b);//->10
       // System.out.println(obj.c);// c is private variable, cannot access from outside of its class
    }
}
