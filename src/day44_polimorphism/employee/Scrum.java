package day44_polimorphism.employee;

public class Scrum {

    public static void main(String[] args) {
        //make a reference of super classes
        Person tester1 = new Tester("James", "Secret agent", 150_000);
        System.out.println(tester1);

        // tester1 can access the name variable

        //these are not accessible because the Person reference doesn't have access to them
       // tester1.work();
       // tester1.create();
        //reference from super class Employee
        Employee tester2 = new Tester("Jose","SDET",100_000);
        System.out.println(tester2);

        //in total tester2 has access to name, jobTitle, salary, work()
        tester2.work();

        Object tester3 = new Tester("Hannah", "QA", 120_000);//syntax is corrected, but problem is tester3 doesn't have any access to anything new. Nothing from Person, Employee, or Tester
        //All invalid:
//        tester3.work();
//        tester3.name;
//        tester3.salary;

        //reference of the interface
        CreateSmokeTest tester4 = new Tester("Kat", "SDET", 200_000);
  //      tester4.work();
        tester4.create(); //tester4 has access to the create() method

        //reference of itself
        Tester tester5 = new Tester("Rose", "QA", 300_000);
        tester5.create();
        tester5.writeBugReport();
        tester5.work();
        System.out.println(tester5);
        //tester5 has access to everything


    }
}
