package day39_inheritance.homework.hw1;

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee("James", true, 100000);
        employee.work();
        System.out.println(employee);

        Tester tester = new Tester("Hannah", true, 100000, true);
        tester.test();
        System.out.println(tester);

        Developer developer = new Developer("Cat", false, 50000, true);
        developer.develop();
        System.out.println(developer);


    }
}
