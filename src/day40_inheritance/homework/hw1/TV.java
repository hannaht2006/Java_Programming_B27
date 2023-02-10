package day40_inheritance.homework.hw1;

public class TV extends Device{
    /*
    Create a class called TV:
- attributes: brand, model, price, wireless
- methods: toString(),
	useDevice(): Override to print Using TV
     */
    public TV (double price){
        super("Samsung", "s1234", price, true);
    }
    @Override
    public void useDevice(){
        System.out.println("Using TV");
    }
}
