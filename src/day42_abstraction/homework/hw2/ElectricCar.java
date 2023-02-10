package day42_abstraction.homework.hw2;

public abstract class ElectricCar extends Car{

    public ElectricCar(String name, String type){
        super(name, type);
    }

    public abstract void charge();
}
