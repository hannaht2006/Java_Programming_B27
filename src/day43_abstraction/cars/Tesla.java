package day43_abstraction.cars;

public class Tesla extends ElectricCar{

    @Override
    public void start() {
        System.out.println("Key car near by, starting the car");

    }

    @Override
    public void charge() {
        System.out.println("Charging station");

    }
}
//since tesla is concrete class extends from ElectricCar, so have to implement both "start" (from Car class) and "charge" (from ElectricCar class) abstract method

//Tesla is a ElectricCar (cannot make an object from ElectricCar class. only make an Object from Tesla class)
//Tesla is a Car
//Tesla is an Object