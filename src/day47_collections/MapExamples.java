package day47_collections;

import java.util.*;

public class MapExamples {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();//random order
        //Keys are Integer
        //values are String

        //map1.add(); there is no add method in Map
        map1.put(4, "four");
        map1.put(1, "One");
        map1.put(7, "seven");
        map1.put(10, "ten");
        map1.put(-2, "negative two");
        map1.put(5, "five");
        map1.put(null, "empty");

        System.out.println(map1);//-> {null=empty, 1=One, -2=negative two, 4=four, 5=five, 7=seven, 10=ten}

        System.out.println("------------------");

        Map<Integer, String> map2 = new LinkedHashMap<>();//maintains insertion order

        map2.put(4, "four");
        map2.put(1, "One");
        map2.put(7, "seven");
        map2.put(10, "ten");
        map2.put(-2, "negative two");
        map2.put(5, "five");
        map2.put(null, "empty");

        System.out.println(map2);//->{4=four, 1=One, 7=seven, 10=ten, -2=negative two, 5=five, null=empty}

        System.out.println("------------------");

        Map<Integer, String> map3 = new TreeMap<>();//maintains natural order for the keys

        map3.put(4, "four");
        map3.put(1, "One");
        map3.put(7, "seven");
        map3.put(10, "ten");
        map3.put(-2, "negative two");
        map3.put(5, "five");
       // map3.put(null, "empty");//null is not allowed at TreeMap

        System.out.println(map3);//->{-2=negative two, 1=One, 4=four, 5=five, 7=seven, 10=ten}

         System.out.println("------------------");

        Map<Integer, String> map4 = new Hashtable<>();// random order

        map4.put(4, "four");
        map4.put(1, "One");
        map4.put(7, "seven");
        map4.put(10, "ten");
        map4.put(-2, "negative two");
        map4.put(5, "five");
     //   map4.put(null, "empty"); null is not allowed in HashTable
     //   map4.put(9, null); not allow null value
        System.out.println(map4);//->{10=ten, 7=seven, 5=five, 4=four, 1=One, -2=negative two}

    }
}
