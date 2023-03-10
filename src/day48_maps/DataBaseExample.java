package day48_maps;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExample {

    /*
    Person:
    First name
    Last Name
    Age
    Address


     */
    public static void main(String[] args) {

        Map<String, String> person1 = new HashMap<>();
        person1.put("FIRST_NAME", "James");
        person1.put("LAST_NAME", "Bond");
        person1.put("AGE", "40");
        person1.put("ADDRESS", "131 PARK DRIVE, LONDON");

        System.out.println(person1.get("FIRST_NAME"));

        List<Map<String, String>> allPeople = new ArrayList<>();
        allPeople.add(person1);
        allPeople.add(Map. of("FIRST_NAME","Anna","LAST_NAME","Jones","AGE","35", "ADDRESS","2312 TUCKER AVE"));

        System.out.println(allPeople);//the whole arrayList of Map elements

        System.out.println(allPeople.get(0));//get the first element from the arraylist. the elements are Maps

        System.out.println(allPeople.get(0).get("FIRST_NAME"));// reads the first ArrayList element, which is a Map, then it gets the value based on the key FIRST_NAME-> James

        //TC: verify all the users in the DB are unique

        //TC: Verify if the information enter on the UI is the same that went into the DB

        //TC: AGE should not be empty

        for(Map<String, String> eachPerson : allPeople){
            if(eachPerson.get("AGE") == null){
                System.out.println("FAIL");
            }
        }


    }
}
