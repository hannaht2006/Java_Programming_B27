package day43_abstraction.cars;

import day42_abstraction.homework.hw2.Toyota;

public class Road {
    public static void main(String[] args) {
        //Toyota car1 = new Toyota();
        BMW car2 = new BMW();
        Tesla car3 = new Tesla();
      //  car1.start();
        car2.start();
        car3.start();
        car3.charge();
    }
}
