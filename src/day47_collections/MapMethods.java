package day47_collections;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        Map<Character, Integer> gradeScale = new HashMap<>();

// adding to the Map: put() method
        gradeScale.put('A',90);
        gradeScale.put('B',80);
        gradeScale.put('C',70);
        gradeScale.put('D',60);
        gradeScale.put('Z',1000);
        gradeScale.put('Z',3000);//using put with a key that is already in the map, will update the value -> print the last value of the key

        System.out.println(gradeScale);

        // reading from the map: use get() method, this method is unique for map
        System.out.println(gradeScale.get('B'));//go to the key and return that value -> 80

        System.out.println(gradeScale.get('b'));//-> null: don't have 'b' key in the map

        //removing from a map:
        gradeScale.remove('Z');
        System.out.println(gradeScale);//-> {A=90, B=80, C=70, D=60}

        //contains in a map:
        System.out.println(gradeScale.containsKey('C'));//-> true
        System.out.println(gradeScale.containsKey('c'));//->false
        System.out.println(gradeScale.containsValue(100));//-> false
        System.out.println(gradeScale.containsValue(90));//-> true


    }
}
