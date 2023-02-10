package day38_encapsulation;

public class AccessModifiers {
    public int a = 5;
    int b = 10; //this has default access because i didn't use any other modifier
    private int c = 20;

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a);//->5
        System.out.println(obj.b);//->10
        System.out.println(obj.c);//-> 20
    }
}
