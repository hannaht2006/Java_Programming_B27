package day47_collections;

import java.util.HashMap;
import java.util.Map;

public class LoopingMap {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("December", 12);
        map.put("April", 4);


     //   for( : map): only map doesn't work
        System.out.println("-- we can looping through set of Keys: ------------");
        for(String eachKey  : map.keySet()){//iterate through set of Keys
            System.out.println( "key- "+eachKey);
            System.out.println( "Value- "+map.get(eachKey));

        }

        System.out.println("--or we can looping through value: ------------");
        for( Integer eachValue : map.values()){//iterate through all the value
            System.out.println(eachValue);

            System.out.println("--or we can looping through entry set: ------------");

            for(Map.Entry<String, Integer> eachEntry : map.entrySet()){//iterates through all the entry
                System.out.println(eachEntry.getKey());
                System.out.println(eachEntry.getValue());

            }
        }
    }
}
