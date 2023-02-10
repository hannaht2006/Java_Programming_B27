package day25_array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int [] arr = {6, 23, 100, 240, 2000};// skip the sort step since the array already in order

        System.out.println(Arrays.binarySearch(arr, 240));// --> 3 (index of element 240 is 3)
        System.out.println(Arrays.binarySearch(arr, 2000)); // --> 4
        System.out.println(Arrays.binarySearch(arr, 25)); //--> -3 : there is no element 25, the return is negative and 3 is because the program try to look for 25 and 25 will be next to 23 in the array +1 = 2+1 =3
        System.out.println(Arrays.binarySearch(arr, 500)); // --> -5
        System.out.println(Arrays.binarySearch(arr, 2500));

        System.out.println("-------------");

        int [] b = {6, 2, -1, 4, 20, -14};
             //     0  1   2  3  4     5
        System.out.println(Arrays.binarySearch(b, 4)); // ---> 3 : randomly correct
        System.out.println(Arrays.binarySearch(b, 6)); // ---> -5
        // binary search method does not work if the array is not sorted
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.binarySearch(b, 4));
        System.out.println(Arrays.binarySearch(b, 6));
        System.out.println(Arrays.binarySearch(b, -14));
        System.out.println(Arrays.binarySearch(b, 0)); //--> -3

        String [] words = {"hello", "world", "zebra", "water"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));//-->[hello, water, world, zebra]
        System.out.println(Arrays.binarySearch(words, "hello"));
        System.out.println(Arrays.binarySearch(words, "World"));// --> -1
        System.out.println(Arrays.binarySearch(words, "yellow")); //--> -4

    }
}
