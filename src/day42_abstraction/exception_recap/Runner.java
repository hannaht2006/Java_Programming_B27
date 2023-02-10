package day42_abstraction.exception_recap;

public class Runner {
    public static void main(String[] args) {

        System.out.println(VendingMachine.select(1));
        // System.out.println(VendingMachine.select(2));//this method has an unchecked exception - normally these exceptions are not handled
        //select(2) --> causes the exception
        try {
            System.out.println(VendingMachine.selectValid(1));//method has checked exception
        } catch (InvalidSelectionException e) {
            System.out.println(e.getMessage());
        }finally {
            //block of code that will always run
            //you could stop this block from running if you use System.exit() before this block.
        }
    }


//    public static void main(String[] args) throws InvalidSelectionException{
//
//        System.out.println(VendingMachine.selectValid(5));
//
//    }
    //using throws will allow the program to compile, but you didn't handle the exception, so when we give the invalid data the exception happen and programs stops

    //if you want to ignore multiple use a comma
    //throwa exception1, exception2....
}
