package day47_collections.group;

import java.util.HashMap;
import java.util.Map;

public class GroupOfPeople {
    public static void main(String[] args) {

        Map<Integer, Person> resident = new HashMap<>();
        //idea: apartment(key) - person(value)
        resident.put(201,new Person("James", 40));
        resident.put(202,new Person("Anna", 20));
        resident.put(203,new Person("Faith", 35));
        resident.put(204,new Person("James", 40));
        resident.put(310, new Person("Hannah", 50));

        System.out.println(resident);//print the map
        for(Integer eachKey: resident.keySet()){
            System.out.println(eachKey);
            System.out.println(resident.get(eachKey));
        }
        for(Person eachPerson : resident.values()){
            System.out.println(eachPerson);
        }

        for(Map.Entry<Integer, Person> eachMap: resident.entrySet()){
            System.out.println(eachMap.getKey());
            System.out.println(eachMap.getValue());
        }

        System.out.println(resident.get(202));//returns the value of the key 202: value is person object-> Person{name='Anna', age=20}

        System.out.println(resident.get(202).name);//accessing the name variable from the person object -> Anna

        System.out.println(resident.get(202).name.substring(0,2));// -> An

    }
}
