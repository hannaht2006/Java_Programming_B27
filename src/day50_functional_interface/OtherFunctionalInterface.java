package day50_functional_interface;

import day47_collections.group.Person;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class OtherFunctionalInterface {
    public static void main(String[] args) {

        BiPredicate<int[], Integer> contains = (arr, num) -> {
           for(int each : arr){
               if(each == num){
                   return true;
               }
           }

            return false;
        };
       int[] arr = {4, 6, 12, 5, 12, 5, 6, 5};
        System.out.println(contains.test(arr, 12)); // true
        System.out.println(contains.test(arr, 8));// false

        System.out.println("-------------");

        BiConsumer<Integer, Integer> multiplicationTable = (num, max) -> {
            for (int i = 01; i < max; i++){
                System.out.println(num + " x " + i + " = " + (num*i));
            }
        };

        multiplicationTable.accept(5, 15);

        Map<Integer, Person> classRoom = new HashMap<>(Map.of(
                1, new Person("James", 35),
                2, new Person("Anna", 30),
                3, new Person("Jane", 23)
        ));
        System.out.println(classRoom);

        classRoom.forEach((key, value) -> System.out.println("key: " + key + "Value: " + value));

        BiFunction<Integer, Integer, Integer> maxNumber = (a, b) -> a > b ? a : b;
        System.out.println(maxNumber.apply(6, 12));

        //make a map of many data -> key -> set, value -> list
        /*
        Set<String> -parameter 1
        List<Integer> - parameter 2
        Map<String, Integer> - return type
         */
        BiFunction<Set<String>, List<Integer>, Map<String, Integer>> createMap = (emails, inboxNumbers) -> {

            List<String> listEmails = new ArrayList<>(emails);//make ArrayList to access to email by index (Set doesn't have index)
            Map<String, Integer> map = new HashMap<>();

            for(int i = 0; i< listEmails.size(); i++){
                map.put(listEmails.get(i), inboxNumbers.get(i));
            }
            return map;
        };

        Set<String> emails = new LinkedHashSet<>(Arrays.asList("James@007.com", "LionLover@gmail.com", "macComputers@gmail.com", "javaisfun@gmail.com"));
        List<Integer> inboxNumbers = new ArrayList<>(Arrays.asList(300, 150, 200, 1000));
//print the map:
        System.out.println(createMap.apply(emails,inboxNumbers));
    }
}
