package day47_collections.hannah;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveWord {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>(Arrays.asList("hannah", "cristen", "catherine", "jane", "peter", "tiffany"));
        Iterator<String> it = name.iterator();

        while(it.hasNext()){
            if(it.next().endsWith("h")){
                it.remove();
            }
        }
        System.out.println(name);
    }
}
