package day39_inheritance.homework.hw1;

public class Employee {
    /*
    Create a Employee class

	- create variables:
		name, is full time, salary

	- create method:
		work()
			Example output: prints $name is working

Create a class Tester

	- Tester class inherits Employee class

	- create additional variables:
		bugs found

	- create method:
		test()
			Example output: prints Running the regression

Create a class Developer

	- Developer class inherits Employee class

	- create additional variables:
		features created

	- create method:
		develop()
			Example output: prints Creating more features

Create objects of all three to see which variables and methods each object has access to
     */

    String name;
    boolean isFullTime;
    double salary;

    public Employee(String name, boolean isFullTime, double salary) {
        this.name = name;
        this.isFullTime = isFullTime;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name+" is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                '}';
    }
}
