package day37_static.homework.computer;

public class Computer {
    /*
    Computer - static

    class name: computer:
        instance variables:
            price, brand, color, ...

        static variables: hasScreen, hasBattery, hasMemory

        make objects of the class in a main method and access both instance and static members from proper references
     */
    double price;
    String brand;
    String color;
    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    public Computer(double price, String brand, String color) {
        this.price = price;
        this.brand = brand;
        this.color = color;
    }
    static{
        hasBattery = true;
        hasMemory = true;
        hasScreen = true;
        System.out.println("Computer features: "+ "\n\t has battery: "+ hasBattery+ "\n\t has screen: "+hasScreen+"\n\t has memory: "+ hasMemory);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
