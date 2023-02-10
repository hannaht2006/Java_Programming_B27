package my_utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class EasyData {
 /*
 getDayOfWeek will return an ArrayList of String with all the days of the week
  */
    public static ArrayList<String> getDayOfWeek(){

        return new ArrayList<>(Arrays.asList("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" ));
    }

    /*
    create a random number ArrayList
     */
    public static ArrayList<Integer> getRandomNumbers(int limit){
       Random random = new Random(); // Research about this class, look at documentation
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < limit; i++){
           list.add(random.nextInt(1000));// 0 to 1000
        }
        return list;
    }
}
