package day35_custom_classes.homework.employee;

public class Company {
    public static void main(String[] args) {
        Employee one = new Employee("Hannah", 5111, "engineer", 60.0);
        Employee two = new Employee("Chris", 0011, "handyman", 10.0);
        System.out.println(one);

        one.goToMeeting("Hannah");

    }
}
