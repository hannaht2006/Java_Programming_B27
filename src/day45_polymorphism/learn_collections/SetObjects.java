package day45_polymorphism.learn_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {
    public static void main(String[] args) {

        //HashSet type:
        Set<String> set1 = new HashSet<>();//HashSet does not maintain insertion order, doesn't have index
        set1.add(null);
        set1.add("hello world");
        set1.add("5.0");
        set1.add("#zebra");
        set1.add("hello world");
        set1.add("Java");
        System.out.println(set1);//->[null, Java, #zebra, 5.0, hello world] : only 1 "hello world"

        //LinkedHashSet type
        Set<String> set2 = new LinkedHashSet<>();//LinkedHashSet maintains insertion order, store new at the end
        set2.add(null);
        set2.add("hello world");
        set2.add("5.0");
        set2.add("#zebra");
        set2.add("hello world");
        set2.add("Java");
        System.out.println(set2);//->[null, hello world, 5.0, #zebra, Java]


        //TreeSet type:
        Set<String> set3 = new TreeSet<>();//TreeSet maintains natural order (sorted: special char, number, Uppercase, lowercase), doesn't get "null" value. doesn't have index
        //set3.add(null); "null is not allowed in TreeSet
        set3.add("hello world");
        set3.add("5.0");
        set3.add("#zebra");
        set3.add("hello world");
        set3.add("Java");
        System.out.println(set3);//-> [#zebra, 5.0, Java, hello world]

        //set3.get(0); doesn't have get() method since set type has no index

    }
}
