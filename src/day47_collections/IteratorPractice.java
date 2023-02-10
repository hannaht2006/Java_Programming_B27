package day47_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {
    public static void main(String[] args) {
        List<String> names = new ArrayList <>(Arrays.asList("James", "Anna", "Emre", "Jane"));
        for(String each:names){
            System.out.println(each);
        }
        System.out.println("----------------");

        Iterator<String> it =  names.iterator();//pin is created, it starts before the first element

        System.out.println(it.hasNext());// checks is there any element after(from where the pin currently is)  -> true: hasNext() return boolean.

        System.out.println(it.next()); // move the pin once and return the value of the element (where the pin is) ->James : next() return the element right next to the iterator

        System.out.println(it.next());//-> Anna
        System.out.println(it.next());//->Emre
        System.out.println(it.next());//->Jane
        System.out.println(it.hasNext());// -> false
       // System.out.println(it.next());//exception occurs because there is no element left -> NoSuchElementException

        System.out.println("------------------------");

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------------");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList (4, 7,2,1,8,4,6,3,10,2,5,1,24,234,6,3));

        Iterator<Integer> itorator = list.iterator();
        while (itorator.hasNext()){
            Integer element = itorator.next();
            if(element <10){
                itorator.remove();
            }
        }
        System.out.println(list);
        System.out.println("---------------");

        List<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList (4, 7,2,1,8,4,6,3,10,2,5,1,24,234,6,3));
        list2.removeIf(p ->  p >24);
        System.out.println(list2);
    }
}
