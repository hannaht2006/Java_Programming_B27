package day05_arithmetic_operators;

public class WithSmallerType {
    public static void main(String[] args) {

        byte b1 = 5;
        byte b2 = 4;
        System.out.println(b1+b2);

        //byte b3 = b1+b2;during calculation the values are turned to int so the result is int
        //solution:
        int i = b1+b2;
        byte b3 = (byte)(b1+b2);
        System.out.println(i);
        System.out.println(b3);
    }
}
