package day36_custom_classes.employee;

public class Employee {
    /*
    create a class called Employee

        - data:

            name, id, job title, salary

        - constructor

            - create a constructor that creates an Employee object with the name, id, job title, and salary

        - method:

            goToMeeting()
                when this method is called print:
                    $name is going to a meeting

            toString()
                print all the employees information

    Create a separate class to create and test the Employee objects
     */
    String name;
    long iD;
    String title;
    double salary;

    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, long iD ){
        this.name = name;
        this.iD = iD;
    }

    public Employee(String name, long iD, String title){
        this.name = name;
        this.iD = iD;
        this.title = title;
    }
    public Employee(String name, long iD, String title, double salary) {
        this.name = name;
        this.iD = iD;
        this.title = title;
        this.salary = salary;
    }

    public void goToMeeting(){
        System.out.println(name + " is go to a meeting");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", iD=" + iD +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                '}';
    }
}
