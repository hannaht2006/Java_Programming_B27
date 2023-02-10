package day44_polimorphism.hw.partone_setup;

public class House extends Building implements HasBackyard{

    int numberOfResident;

    public House(String location, double price,int numberOfResident){
        super(location,price);
        this.numberOfResident = numberOfResident;
    }

    @Override
    public void pay() {
        System.out.println("Paid off house");

    }

    @Override
    public void mowLawn() {
        System.out.println("mow lawn every week");

    }

    @Override
    public String toString() {
        return "numberOfResident= " + numberOfResident +
                ", location='" + location + '\'' +
                ", price= " + price;
    }
}
