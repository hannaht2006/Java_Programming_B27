package day06_relational_operators;

public class CastingRecap {
    public static void main(String[] args) {
        int age = 40;
        long ageLong = age;

        long num = 100;
        int numInt = (int)num;

        long boxes = 30000000L;

        float f = 14.5F;
        int i= (int)f;
        System.out.println(i);
        double d = f;
        System.out.println(d);
        double d2=i;
        System.out.println(d2);

        System.out.println("-------------");
        int a = 20;
        ++a; //21

      System.out.println(a--); //21
        System.out.println(a++);//20
        System.out.println(--a);//20
        System.out.println(++a);//21


    }
}
