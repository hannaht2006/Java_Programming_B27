package day39_inheritance.homework.hw1;

public class Developer extends Employee{
    boolean featuresCreated;

    public Developer (String name, boolean isFullTime, double salary, boolean featuresCreated){
        super(name, isFullTime, salary);
        this.featuresCreated = featuresCreated;
    }
    public void develop(){
        System.out.println("Creating more features");
    }
}
