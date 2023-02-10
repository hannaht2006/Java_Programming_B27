package day32_arraylist;

import my_utils.EasyData;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("friday", "java", "summer","reading","coding", "java","coding","summer"));
        System.out.println(searchInList(list, "java"));
        System.out.println(searchInList(list, "coding"));

// testing the EasyData
      //  new ArrayList<>(Arrays.asList("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" ));
        // above can only be used in this file, but below we are using the dynamic method that can create

        ArrayList<String> days = EasyData.getDayOfWeek();
        System.out.println(days);

    }

    public static int searchInList(ArrayList<String>list, String target){
        int count = 0;
        for (String each : list){
            if (each.equals(target)){
                count++;
            }
        }
        return count;
    }

}
