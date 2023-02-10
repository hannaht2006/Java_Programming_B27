package day40_inheritance.homework.hw1;

import day40_inheritance.app.Phone;

public class Device {
    /*
    Create a class called device:
- attributes: brand, model, price, wireless
- methods: toString(), useDevice()

Create a class called TV:
- attributes: brand, model, price, wireless
- methods: toString(),
	useDevice(): Override to print Using TV
*/
    String brand;
    String model;
    double price;
    boolean wireless;

    public Device (String brand, String model, double price, boolean wireless){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.wireless = wireless;
    }

    public  void useDevice(){
        System.out.println("Using device");
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", wireless=" + wireless +
                '}';
    }

    /*

Create a class called Phone:
- attributes: brand, model, price, wireless
- methods: toString(),
	useDevice(): Override to print Using Phone

Create a class UseDevice

	create an object of TV and Phone and verify if constructor, toString(), and useDevice() are working properly for each class

	List the is a relations of all the classes
     */
}
