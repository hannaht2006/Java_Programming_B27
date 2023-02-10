package day47_collections;

import my_utils.StringUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Map<String, Double> store = new HashMap<>(
                Map.of("Water", 2.99, "Bread", 4.55, "Milk", 2.89, "fruit", 3.31)
        );//this syntax allow us to create a map quickly.
        System.out.println(store);

        System.out.println("what item would you like");
        //String item = input.next();// will have problem with case. to fix it, use the fixFormat method in util class:
        String item = StringUtil.fixFormat(input.next());//calling our utility method to fix the formatting of the String

        if(store.containsKey(item)){
            System.out.println(item + " is in stock");
            System.out.println("price is "+ store.get(item));
        }else{
            System.out.println(item + " is not in stock");
        }
    }
}
