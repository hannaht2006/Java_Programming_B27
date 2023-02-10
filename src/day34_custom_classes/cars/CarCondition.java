package day34_custom_classes.cars;

public class CarCondition {
    public static void main(String[] args) {
        Car carOne = new Car();
        carOne.model = "Accord";
        carOne.color = "Red";
        carOne.year = 2020;
        carOne.fuelLevel = 50;

        System.out.println(carOne);

        carOne.drive();
        System.out.println(carOne);
        carOne.fillTank();
        System.out.println(carOne);

        carOne.isLow(carOne.fuelLevel);


    }
}
