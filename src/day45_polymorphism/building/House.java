package day45_polymorphism.building;

public class House extends Building implements HasBackyard{
    int numberOfResident;

    public House(String location, double price, int numberOfResident) {
        super(location, price);
        this.numberOfResident = numberOfResident;
    }

    @Override
    public void pay() {
        System.out.println("Paying mortgate");
    }

    @Override
    public void mowLawn() {
        System.out.println("Mowing the lawn in the backyard");

    }
    public String toString(){
        return super.toString() + " , Number of resident: "+numberOfResident;
    }
}
