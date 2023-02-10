package day06_relational_operators;

public class LeapYear {
    /*
    create a class LeapYear

    declare and assign a year variable
    check if the year is a leap year, a year will be a leap year if it is divisible by 4
     */
    public static void main(String[] args) {
        int year = 2024;
        boolean leapYear = year % 4 ==0;

        System.out.println("This year is leap year : "+leapYear);

    }
}
