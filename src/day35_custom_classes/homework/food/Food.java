package day35_custom_classes.homework.food;

public class Food {
    /*
     create a class called Food

        - data:

            name, quantity, unit price, total price

        - constructor

            - create a constructor that creates a Food object with the name, quantity, and unit price
                -> call calculatePrice() method here

        - method:

            - calculatePrice(): multiple the quantity by unit price and assign the value to the total price

            - toString()
                print all the Food information

    Create a separate class to create and test the Food objects
     */
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    public Food (String name, int quantity, double unitPrice){
        this.name = name;
        this.quantity= quantity;
        this.unitPrice = unitPrice;

    }

    public void calculationPrice(){
        totalPrice = quantity*unitPrice;
    }


    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
