package day44_polimorphism.hw.partone_setup;

public abstract class Building {

    String location;
    double price;

    public abstract void pay();

    public Building(String location, double price) {
        this.location = location;
        this.price = price;
    }
public String toString(){
        return "Location: "+location+ " Price: "+price;
}

}
/*
Create an abstract class Building

    create instance variables:
        String location
        double price

    create abstract methods:
        void pay()

    create a constructor to assign the location & price

    override the toString to print the location & price

Create an interface HasElevator
    abstract method:
        void elevator(int floor)

Create an interface HasBalcony
    abstract method:
        void openBalcony()

Create an interface HasBackyard
    abstract method:
        void mowLawn()

Create an class House
    child class of Building
    implements HasBackyard

    create instance variable
        int number of residents

    create a constructor to assign the location, price, and number of residents

    implement all abstract methods (give some print statements. Ex: Paying for House, or Going into Backyard)

    override the toString to print the location, price, and number of residents

Create an class Apartment
    child class of Building
    implements HasBalcony

    create instance variable
        int months of lease

    create a constructor to assign the location, price, and months of lease

    implement all abstract methods (give some print statements)

    override the toString to print the location, price, and months of lease

Create an class OfficeBuilding
    child class of Building
    implements HasElevator

    create instance variable
        int number of floors

    create a constructor to assign the location, price, and number of floors

    implement all abstract methods (give some print statements)

    override the toString to print the location, price, and number of floors
 */
