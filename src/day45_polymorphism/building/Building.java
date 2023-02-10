package day45_polymorphism.building;

public abstract class Building {

    String location;
    double price;

    public abstract void pay();

    public Building(String location, double price){
        this.location = location;
        this.price = price;
    }

    public String toString(){
        return "location: " + location + " , price: " + price;
    }
}
