package day48_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyPractice {
    public static void main(String[] args) {

        String str = "selenium";
        Map<Character, Integer> counter = new LinkedHashMap<>();

        for(int i = 0; i<str.length(); i++){
            char key = str.charAt(i);

            if(counter.containsKey(key)){
                counter.put(key, counter.get(key));

            }else{

                counter.put(key, 1);
            }


        }
        System.out.println(counter);
    }
}
