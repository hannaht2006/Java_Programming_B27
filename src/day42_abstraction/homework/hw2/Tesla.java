package day42_abstraction.homework.hw2;

public class Tesla extends ElectricCar{

    public Tesla(String name, String type){
        super(name, type);
    }

    @Override
    public void start() {
        System.out.println("key card near by, starting car");
    }

    @Override
    public void charge() {
        System.out.println("at tesla charging station");
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
