package day39_inheritance.pizza;

public class Pizza {
    /*
    create a class called Pizza

        - data:

            size (String), number of toppings
*/
    private String size;
    private int numberOfTopping;

    /*

        - constructor

            - create a constructor that creates a Pizza object with the length and the width

            	call setters here
*/
    public Pizza (String size,int numberOfTopping){
        setSize(size);
        setNumberOfTopping(numberOfTopping);
    }

    /*

        - encapsulate the Pizza class

        	- setter condition:
        		size can only be:
        			small, medium, or large

        		number of toppings must be a positive number
*/
    public void setSize(String size){
        if (size.equalsIgnoreCase("small")||size.equalsIgnoreCase("medium")||size.equalsIgnoreCase("large")){
            this.size =size;
        }
    }
    public String getSize(){
        return size;
    }

    public int getNumberOfTopping(){
        return numberOfTopping;
    }

    public void setNumberOfTopping(int numberOfTopping){
        if (numberOfTopping >= 0){
            this.numberOfTopping = numberOfTopping;
        }
    }

    /*
           - other methods methods:

            - calculatePrice()
            		calculate the price of the pizza based on:

            			small base: $4
            			medium base: $6
            			large base: $8

            			each topping adds $0.75 to the price

            			calculate the total price and return the cost
*/

   public double calculatePrice(){

       if (size !=null){
        return (size.equals("small")? 4 : size.equals("medium")? 6 :  8)  + numberOfTopping*.75;

       }
       return -1;
   }

    /*

            - toString()
                print the size, number of toppings, and cost of the pizza

    Create a separate class to create and test the Pizza objects
     */
    public String toString(){
        return "size: " + size + ", number of topping: " + numberOfTopping + ", price: "+ calculatePrice();
    }

}
