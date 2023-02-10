package day07_scanner;

import java.sql.SQLOutput;

public class ShortCircuitEx {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(false && true);
        //System.out.println(5/0); you cannot divide by 0

        //System.out.println(true&&5/0 ==0)
        System.out.println(false && 5/0 ==0);

        //System.out.println(false & 5/0==0);
        System.out.println(true||false);// true

        int count = 0;
        System.out.println(true || count++ ==1);// code (count++) will not run after "true" with ||, so count++ will not run --> count =0
        System.out.println(count);
    }
}
