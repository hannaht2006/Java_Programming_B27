package day22_arrays;

import java.util.Arrays;

public class DoubleExample {
    public static void main(String[] args) {

        double [] price = new double[4];
        System.out.println(Arrays.toString(price));

        price [0]= 12.99;
        System.out.println(Arrays.toString(price));

        price[1] = 9.50;
        price[2] = 13.10;
        price[3] = 20.30;
        System.out.println(Arrays.toString(price));

        price [2] = 214.99; // reassigning the array index 2
        System.out.println(Arrays.toString(price));

    }
}
