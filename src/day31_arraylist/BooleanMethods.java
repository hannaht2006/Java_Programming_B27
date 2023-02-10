package day31_arraylist;

import java.util.ArrayList;

public class BooleanMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list.isEmpty());//--> true because list is empty now
        list.add(4);
        list.add(5);
        list.add(41);
        list.add(5512);
        list.add(413);
        System.out.println(list);//--> [4, 5, 41, 5512, 413]

        System.out.println("is empty: "+list.isEmpty());//--> false : not empty
        System.out.println("contains 5000: " + list.contains(5000));//--> false : not contain element 5000
        System.out.println("contains 5: " + list.contains(5));//--> true; contains method check if the given argument is an element in the ArrayList

        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println(list.isEmpty());//--> true because list is empty now
        list2.add(4);
        list2.add(5);
        list2.add(41);
        list2.add(5512);
        list2.add(413);

        System.out.println(list2);
        System.out.println("equals: "+ list.equals(list2));//--> true : list same value with list2
        list2.remove(0);
        System.out.println("equals: "+ list.equals(list2));// --> false

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.add(1);
        list3.add(2);
        list3.add(3);

        ArrayList<Integer> list4 = new ArrayList<>();

        list4.add(3);
        list4.add(2);
        list4.add(1);

        System.out.println(list3);
        System.out.println(list4);
        System.out.println(list3.equals(list4));//--> false (list3 is not identical with list4)





    }
}
