package day46_collections;

import java.util.*;

public class ReadFromSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();// HashSet doesn't maintain order
        set.add(4);
        set.add(5);
        set.add(12);
        set.add(34);
        set.add(-1);
        set.add(9);
        System.out.println(set);
       // set.get(); there is no get() method. how to access the elements?

        for (int each : set){
            if (each>10){
                System.out.println(each);
            }
        }
        Set<String> handles =  new HashSet<>();
        handles.add("daajllj7263");
        handles.add("kgsefyweo90");

        for(String each : handles){
            if(!each.equalsIgnoreCase("daajllj7263")){
                //switch to the other handle
            }
        }

        Set<String> set3 = new HashSet<>();
        set3.add("hello");
        set3.add("bye");
        set3.add("java");
        set3.add("world");
        System.out.println(set3);

//convert to ArrayList to maintain order and not duplicate and can access to the element by index:
        List<String> list = new ArrayList<>(set3);
        System.out.println(list);
        list.get(0);//now can access to the element
        System.out.println(list.get(1));

//remove duplicate occurence of each character
        String s ="AAAABBBCCCCCCDDDDD";

        System.out.println(new ArrayList<>(Arrays.asList(s.split(""))));//create ArrayList from String s first

        System.out.println(new LinkedHashSet(new ArrayList<>(Arrays.asList(s.split("")))));//then ... remove the duplicate by convert to LinkedHashSet

        System.out.println(new LinkedHashSet(new ArrayList<>(Arrays.asList(s.split("")))).toString().replace(", ", "").replace("[", "").replace("]", ""));//make back to String

    }
}
