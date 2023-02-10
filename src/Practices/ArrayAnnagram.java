package Practices;

import java.util.*;

public class ArrayAnnagram {
    public static void main(String[] args) {
        String[] values = {"moob", "eat", "tea", "tam", "ate", "mat", "bat", "boom"};

        Map<String, List<String>> anagram = new HashMap<>();

        for (String each : values) {
            char[] temp = each.toCharArray();
            Arrays.sort(temp);
            String sortWord = new String(temp);
            if (!anagram.containsKey(sortWord)) { // Key does not exist
                // Create an empty list and add value to the list
                List<String> newValue = new ArrayList<>();
                newValue.add(each);
                anagram.put(sortWord, newValue);
            } else { // Key already exist
                // Retrieve the exiting list by key and add value to the list
                List<String> updateList = anagram.get(sortWord);
                updateList.add(each);
                anagram.put(sortWord, updateList);
            }
        }
        System.out.println(anagram.values());
    }


}
