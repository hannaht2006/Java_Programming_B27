package day42_abstraction.exception_recap;

public class OutOfStockException extends RuntimeException{//being of RuntimeException means we create an unchecked exception

    public OutOfStockException(){
        super("Item is out od stock"); //this helps us to define the message of the exception
    }

}
