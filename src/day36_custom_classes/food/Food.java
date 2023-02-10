package day36_custom_classes.food;

public class Food {
    /*
     create a class called Food

        - data:

            name, quantity, unit price, total price

        - constructor
     */
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;
    /*
      - create a constructor that creates a Food object with the name, quantity, and unit price
                -> call calculatePrice() method here
     */
    public Food(String name){
        this.name = name;
    }

    public Food(String name, int quantity) {
        this(name);
        this.quantity = quantity;
    }

    public Food(String name, int quantity, double unitPrice) {
        this(name,quantity);
        this.unitPrice = unitPrice;
        calculatePrice();

    }
    /*
     - method:

            - calculatePrice(): multiple the quantity by unit price and assign the value to the total price

            - toString()
                print all the Food information

    Create a separate class to create and test the Food objects
     */
    public boolean calculatePrice(){
        if (quantity<=0 || unitPrice<=0){
            return false;// total price was not calculated
        }
        totalPrice = quantity*unitPrice;
        return true;
    }
    public String toString(){
        String str = "name: "+name;
        if (quantity !=0){
            str += ", quantity: "+quantity;
        }
        if (unitPrice !=0){
            str += ", UnitPrice: "+unitPrice;
        }
        if (totalPrice!=0){
            str += ", totalPrice: "+totalPrice;
        }
        return " < " +str+" > ";
    }
}
