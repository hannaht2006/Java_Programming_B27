package day48_maps;

import java.util.*;

public class Countries {
    public static void main(String[] args) {

        //key: countries - String
        //value: cities - List<String>
        Map<String, List<String>> countries = new HashMap<>();
        countries.put("United States", new ArrayList<>(Arrays.asList("Chicago", "Dallas", "Irvine", "SanDiego", "New York", "Philadelphia", "Madison")));//use constructor to create the value cities as ArrayList

//Arrays.asList() --> immutable List: can not add

        System.out.println("Map " + countries);//-> {United State=[Chicago, Dallas, Irvine, SanDiego, New York, Philadelphia, Madison]}

        countries.get("United States").add("Seatle");//add more city to the ArrayList value

        System.out.println("ARRAYLIST " + countries.get("United States"));

        System.out.println("FIRST CITY " + countries.get("United States").get(0));// first get() is from map, second get() is from arraylist

        System.out.println(countries);//-> {United State=[Chicago, Dallas, Irvine, SanDiego, New York, Philadelphia, Madison, Seatle]}


        countries.put("Europe", new ArrayList<>(Arrays.asList("London", "Paris", "Rome", "Istanbul", "Berlin", "Madrid")));
        countries.put("Uzbekistan", new ArrayList<>(Arrays.asList("Tashkent", "Samarkan", "Fergana", "Urgench", "Bakht")));
        countries.put("Kazakhstan", new ArrayList<>(Arrays.asList("Astana", "Almaty", " Aktobe", "Kokshetau", "Petropavlovsk")));

        System.out.println(countries);

        System.out.println("------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Which country are you going to tour?" + countries.keySet());//print countries name only
        String country = input.next();
        for (String eachCity : countries.get(country)) {//iterate through each city of a specific country
            System.out.println("Touring ... " + eachCity);
        }

        System.out.println("---looping through entry set: -------");

        for (Map.Entry<String, List<String>> eachEntry : countries.entrySet()) {

            for (String eachCity : eachEntry.getValue()) { //the value of each Entry was the cities

                if (eachCity.startsWith("A") || eachCity.endsWith("a")) {
                    System.out.println(eachCity);
                }
            }

        }
    }
}
