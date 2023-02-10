package day30_practice_wrapper;

import my_utils.ArrayUtil;

import java.util.Arrays;

public class UsingArraysUtilClass {

    public static void main(String[] args) {

        int num = ArrayUtil.min(4,2,1,5,-1,2,5,2,-1,5);
        System.out.println(num);
        System.out.println(ArrayUtil.min(5,3,2,5,8));

        System.out.println(ArrayUtil.max(5,3,6,10,1));

        System.out.println(" find max:");

        int []a ={ 1,12,4,67,3,5};
        System.out.println(ArrayUtil.max(a));
        System.out.println(ArrayUtil.max(new int[]{4, 5,6 ,7,1,}));

        System.out.println(" contains:");

        int []b = { 4, 5, 12, 14, 5};
        System.out.println(ArrayUtil.contains(13, b));
        System.out.println(ArrayUtil.contains(5, b));

        System.out.println("index of:");

        int [] c = {4, 3, 2, 1, 6};
        System.out.println("Index of 3:" + ArrayUtil.indexOf(c, 3));
        System.out.println(" Index of 7: " + ArrayUtil.indexOf(c, 7));

        System.out.println("overloaded use:");
        int [] d = { 4, 5,1 ,6, 3, 6, 5, 4, 1};
        System.out.println("Index of first 6: "+ ArrayUtil.indexOf(d,6));
        System.out.println("Index of second 6: "+ ArrayUtil.indexOf(d,6, 4));

        int firstIndex = ArrayUtil.indexOf(d, 6);// same as line 35
        int secondIndex = ArrayUtil.indexOf(d, 6, firstIndex+1);//same as line 36

        System.out.println("-----------------------\n Add element method");

        String [] words = { "java", "is", "the", "best"};
        // i want to add : "language" into the array words
        String [] allWords = ArrayUtil.addElement(words, "language");
        System.out.println(Arrays.toString(allWords));

        System.out.println("-----------------------\n Add element method");

        String [] strs = {"today", "is", "monday"};
        String []other = {"no", "softskills", "today"};

        String [] multipleAdded = ArrayUtil.addElement(strs, other);
        System.out.println(Arrays.toString(multipleAdded));

    }

}
