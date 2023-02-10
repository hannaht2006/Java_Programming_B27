package Practices;

public class Car2 {
    String branch;
    String model;
    String color;
    int yearMade;
    int fuelTank;
    int miles;

    @Override
    public String toString() {
        return "Car2{" +
                "branch='" + branch + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearMade=" + yearMade +
                ", fuelTank=" + fuelTank +
                ", miles=" + miles +
                '}';
    }

    public void drive(){
        System.out.println("It's brand new car, let test drive");
        miles += 5;
    }

}
