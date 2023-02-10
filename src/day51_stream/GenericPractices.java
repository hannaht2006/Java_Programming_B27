package day51_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericPractices {
    public static void main(String[] args) {

        Integer [] num = {1,4,8,10};
        Double [] decimals = {2.5, 3.8, 6.3, 2.1, 4.8};
        String[] words = {"Monday", "Tuesday", "Sunday"};

        //Shape[] shapes = {null, null};

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,4,9,3,89,3 ));

 //Generics methods:
        GenericMethods.printEach(list1);

//Generics class: create object of Generics class to use the method of Generics class
        Generics<Integer> obj = new Generics<>();
        obj.printEach(num);
    }

}
