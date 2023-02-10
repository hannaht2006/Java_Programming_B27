package day39_inheritance.homework.hw1;

public class Tester extends Employee{

    boolean bugFound;

    public Tester (String name, boolean isFullTime, double salary, boolean bugFound){
        super(name, isFullTime, salary);
        this.bugFound = bugFound;
    }
    public void test(){
        System.out.println("Running the regression");
    }

}
