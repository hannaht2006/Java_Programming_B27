package day48_maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Season {
    public static void main(String[] args) {

        //average temp each season
        Map<String, Double> temperature = new HashMap<>();
        temperature.put("summer", 85.0);
        temperature.put("fall", 65.2);
        temperature.put("winter", 30.5);
        temperature.put("spring", 68.2);
        System.out.println(temperature);

        temperature.put("summer", 87.0);//update (re-assign) value of key summer
        System.out.println(temperature);

        System.out.println("Average for winter "+temperature.get("winter"));
        System.out.println("Average for spring "+temperature.get("spring"));
        System.out.println("Average for summer "+temperature.get("summer"));
        System.out.println("Average for fall "+temperature.get("fall"));

        System.out.println(temperature.containsKey("mid summer"));//-> false
        System.out.println(temperature.containsValue(100.0));//->false

        //are there any duplicate value?
        System.out.println(temperature.values());//->[68.2, 65.2, 30.5, 87.0]
        int before = temperature.values().size();
        int after = new HashSet<>(temperature.values()).size();

        System.out.println(before == after ? "no duplicate" : "Duplicate values");//check if the size of before and after convert to HashSet(unique, no duplicate collection) change or not to find if there is the duplicate

        //find the average temp for all seasons
        System.out.println(avgTemp(temperature));//call the avgTemp method to calculate the average temp of temperature

        double averageTemp =0;
        for(double eachtemp : temperature.values()){
            averageTemp += eachtemp;
        }
        double finalAverage = averageTemp/temperature.values().size();
        System.out.println(finalAverage);
    }
    //find average method:
    public static double avgTemp(Map<String, Double> map){
        double average = 0;
        for(double eachTemp: map.values()){
            average += eachTemp;
        }
        return average/map.size();
    }

}
