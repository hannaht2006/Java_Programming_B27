package day44_polimorphism.hw.partone_setup;

public class OfficeBuilding extends Building implements HasElevator{

    int numberOfFloor;
    public OfficeBuilding (String location, double price, int numberOfFloor){
        super(location, price);
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public void pay() {
        System.out.println("pay the lease yearly");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void elevator(int floor) {
        System.out.println("there are 4 elevators for 44 floors");

    }
}
