package day44_polimorphism.employee;

import java.util.ArrayList;

public class Company {
    public static void main(String[] args) {

        ArrayList<Employee> allEmployees = new ArrayList<>();
        allEmployees.add(new Tester("Anam", "SDET",190_000));
        allEmployees.add(new Tester("Hannah", "SDET",180_000));
        allEmployees.add(new Developer("James", "SDET",100_000));
        allEmployees.add(new Developer("Husan", "Lead developer",390_000));
        allEmployees.add(new Developer("Baz", "Developer",250_000));

        double biggestSalary = allEmployees.get(0).salary;//default salary

        for(Employee each: allEmployees){
            if (each.salary > biggestSalary){
                biggestSalary = each.salary;
            }
        }
        System.out.println(biggestSalary);

        ArrayList<Tester> allTesters = new ArrayList<>();
        ArrayList<Developer> allDevelopers = new ArrayList<>();

        for(Employee each : allEmployees){
            if (each instanceof  Tester){
                allTesters.add((Tester)each);
            }else if (each instanceof Developer){
                allDevelopers.add((Developer) each);
            }
        }

        System.out.println(allTesters);
        System.out.println(allDevelopers);
    }
}
