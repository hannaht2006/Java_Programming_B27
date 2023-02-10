package day42_abstraction.person;

import java.util.ArrayList;
import java.util.Arrays;

public class WorkPlace {
    public static void main(String[] args) {

      // cannot create objects of the abstract classes
//        Person obj = new Person();
//        Employee obj2 =  new Employee();

        Tester baz = new Tester("Baz", 20, "ESDET",100-100);
        System.out.println(baz);

        baz.sleep(8);
        baz.work();

        ArrayList<Tester>testers = new ArrayList<>();
        testers.add(baz);
        testers.addAll(Arrays.asList(new Tester("Bata",30,"SDET",150000),
                new Tester("Jon",40,"Senior SDET",120000),
                new Tester("Isa",30,"SDET",180000),
                new Tester("Nasiba",25, "SDET", 120000)));
        System.out.println();

        for (Tester each:testers){
            System.out.println(each);
            each.sleep(8);
            System.out.println();
        }
    }
}
