package day06_relational_operators;

public class Store {

    public static void main(String[] args) {
        int numberOfItems = 0;
        double price = 0.0;
        System.out.println("Go and pick up some coffee");
        System.out.println("Items in the cart : "+ ++numberOfItems);
        price += 3.55; // price = price + 3.55

        System.out.println("Go pick up some milk");
        System.out.println("add 1 gallon of milk "+ ++numberOfItems);
        price += 5.99; // Price = price + 5.99
        System.out.println("Total is $ " + price);



    }
}
