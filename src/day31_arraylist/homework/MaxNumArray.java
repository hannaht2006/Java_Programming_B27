package day31_arraylist.homework;

import java.util.ArrayList;

public class MaxNumArray {
    /*
    Try to loop:
Create an ArrayList of Double elements
Fill the ArrayList with some values
Find the max element from the ArrayList
     */
    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(10.55);
        numbers.add(19.70);
        numbers.add(8.25);
        numbers.add(55.99);
        numbers.add(1.75);

        System.out.println(numbers);
        System.out.println(numbers.get(0));

       double max = numbers.get(0);
        System.out.println(max);

        for (int i =1; i< numbers.size();i++){
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        System.out.println(max);



    }
}
