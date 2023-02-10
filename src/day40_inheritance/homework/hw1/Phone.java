package day40_inheritance.homework.hw1;

public class Phone extends Device{

    public Phone(double price){
        super("Iphone", "X14",price, true);
    }
    @Override
    public void useDevice(){
        System.out.println("Using Phone");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", wireless=" + wireless +
                '}';
    }
}
