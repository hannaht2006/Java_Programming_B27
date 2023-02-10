package day47_collections;

import java.util.*;

public class RemoveLength {
    public static void main(String[] args) {

        Set<String> words = new HashSet<>(Arrays.asList("one", "two", "three", "Java", "Hello", "automation", "soft skill", "lunch", "world"));

        Iterator<String> it = words.iterator();

        while(it.hasNext()){
            if (it.next().length()<=4){//check the length of the String (it.next() will get the element (String))
                it.remove();
            }
        }
        System.out.println(words);// ->[lunch, automation, world, Hello, three, soft skill]
        System.out.println(new TreeSet<>(words));//->[Hello, automation, lunch, soft skill, three, world]

    }
}
