package day42_abstraction.exception_recap;

public class InvalidSelectionException extends Exception{//being a sub class of Exception class makes a checked exception
    public InvalidSelectionException(){
        super("Selection can only be 1, 2, 3");
    }
}
