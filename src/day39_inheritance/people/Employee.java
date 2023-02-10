package day39_inheritance.people;

public class Employee extends Person {

    double salary;

    public Employee (String name, int age, double salary){
        super(name, age);// calls parent constructor with no args
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
/*
public Employee (){
        super();// calls parent constructor with no args
    }

 */