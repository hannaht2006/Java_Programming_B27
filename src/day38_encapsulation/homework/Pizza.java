package day38_encapsulation.homework;

public class Pizza {
    /*
     create a class called Pizza

        - data:

            size (String), number of toppings

        - constructor

            - create a constructor that creates a Pizza object with the length and the width

            	call setters here

        - encapsulate the Pizza class

        	- setter condition:
        		size can only be:
        			small, medium, or large

        		number of toppings must be a positive number

        - other methods methods:

            - calculatePrice()
            		calculate the price of the pizza based on:

            			small base: $4
            			medium base: $6
            			large base: $8

            			each topping adds $0.75 to the price

            			calculate the total price and return the cost

            - toString()
                print the size, number of toppings, and cost of the pizza

    Create a separate class to create and test the Pizza objects

     */
    String size;
    int numberOfTopping;
    double price;

    public Pizza(String size, int numberOfTopping) {
        setSize(size);
        this.numberOfTopping = numberOfTopping;
        calculatePrice();
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")) {
          this.size = size;
        }
    }

    public String getSize() {
        return size;
    }

    public int getNumberOfTopping() {
        return numberOfTopping;
    }

    public void setNumberOfTopping(int numberOfTopping) {
        if (numberOfTopping > 0) {
            this.numberOfTopping = numberOfTopping;
        }
    }

    public double calculatePrice(){
        switch(size){
            case"small":
               price = 4 + numberOfTopping* 0.75;
               break;
            case "medium":
                price = 6 + numberOfTopping* 0.75;
                break;
            case "large":
                price = 8 + numberOfTopping* 0.75;

        }
        return price;
    }

    @Override
    public String
    toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfTopping=" + numberOfTopping +
                ", price=" + price +
                '}';
    }
}
