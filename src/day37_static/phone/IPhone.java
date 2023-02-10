package day37_static.phone;

import java.sql.SQLOutput;

public class IPhone {

    //instance variable
    String model;
    String color;
    double price;
    int storage;

    //static variable
    static String os;
    static String brand;

    //static block used to initialize static variable
    static{
        System.out.println("STATIC BLOCK RUN");
        os = "IOS";
        brand = "Apple";
    }
    static{
        System.out.println("hello");
    }

    //constructor used to initialize instance variable
    public IPhone(String model, String color, double price, int storage) {

        System.out.println("CONSTRUCTION RUN");
        this.model = model;
        this.color = color;
        this.price = price;
        this.storage = storage;

    }
    /*
    Difference between static block and constructor
    static block will run once, the first time when the class is used. --> we can write
    constructor will be called every time an object is made
     */

    @Override
    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
