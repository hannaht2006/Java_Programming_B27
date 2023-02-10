package day25_array;

import java.util.Arrays;

public class Extra {
    public static void main(String[] args) {

        String [] str = {"hello", "world", "monday", "java"};
        System.out.println(Arrays.toString(str));
        String.join("#",str);
        System.out.println(String.join("#",str));//-->hello#world#monday#java
        System.out.println(String.join(" ",str));//-->hello world monday java
        System.out.println(String.join(" MIDDLE ",str));//-->hello MIDDLE world MIDDLE monday MIDDLE java

        int [] aa = new int [] {1, 5, 2, 5};// another syntax to create an array.

        // normally used when we don't need a reference, when we want a quick array to use for 1 time:
        System.out.println(Arrays.toString(new int []{3, 5, 2, 6})); // create array, print it, doesn't have a reference to it after in the program



    }
}
