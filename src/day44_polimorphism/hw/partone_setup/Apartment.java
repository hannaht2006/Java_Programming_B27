package day44_polimorphism.hw.partone_setup;

public class Apartment extends Building implements HasBalcony{

    int monthOfLease;

    public Apartment (String location, double price, int monthOfLease){
        super(location, price);
        this.monthOfLease = monthOfLease;
    }

    @Override
    public void pay() {
        System.out.println("pay the rent monthly");
    }

    @Override
    public void openBalcony() {
        System.out.println("Balcony has very nice view");

    }

    @Override
    public String toString() {
        return "Apartment{" +
                "monthOfLease=" + monthOfLease +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}
