package day36_custom_classes.employee;

public class EmployeeV2 {
    String name;
    long iD;
    String title;
    double salary;

    public EmployeeV2(String name) {
        this.name = name;
    }

    public EmployeeV2(String name, long iD) {
        this(name);
        this.iD = iD;
    }

    public EmployeeV2(String name, long iD, String title) {
        this(name, iD);
        this.title = title;
    }

    public EmployeeV2(String name, long iD, String title, double salary) {
        this(name, iD, title);
        this.salary = salary;
    }

    public void goToMeeting() {
        System.out.println(name + " is go to a meeting");
    }


    public String toString() {

        String output = "Name: " + name;

        if (iD != 0) {//true if the id was initialized
            output += " , id: " + iD;
        }
        if (title != null) {
            output += ", job title: " + title;
        }
        if (salary != 0) {
            output += ", salary: " + salary;
        }
return output;
    }

//    public EmployeeV2 (int a){
//        this();
//    }
//    public EmployeeV2(){
//        this(5);
//    }
    //not allow to call itself
}



