package day42_abstraction.homework.hw2;

public class RunCar {
    public static void main(String[] args) {
        Toyota car1 = new Toyota("Toyota", "gas");
        System.out.println(car1);
        car1.start();


        BMW car2 = new BMW("BMW", "gas");
        System.out.println(car2);
        car2.start();


        Tesla car3 = new Tesla("Tesla", "Electric");
        System.out.println(car3);
        car3.start();
        car3.charge();

    }
}
