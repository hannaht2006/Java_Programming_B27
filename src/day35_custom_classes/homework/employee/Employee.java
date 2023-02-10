package day35_custom_classes.homework.employee;

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
    int iD;
    String jobTitle;
    double salary;

    public Employee(String name, int iD, String jobTitle, double salary){
        this.name = name;
        this.iD = iD;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void  goToMeeting(String name){
        System.out.println(name + " go to meeting");
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", iD=" + iD +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
