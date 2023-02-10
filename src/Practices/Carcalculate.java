package Practices;

public class Carcalculate {
    public static void main(String[] args) {

        Car2 carOne = new Car2();

        carOne.branch = "Honda";
        carOne.model = "Accord";
        carOne.color = "Blue";
        carOne.yearMade = 2022;
        carOne.fuelTank = 50;
        carOne.miles = 0;

        System.out.println(carOne);
        carOne.drive();
        System.out.println("Mileage: " + carOne.miles);
    }
}
