package Practices.exception;

public class TryAndCatch {
    public static void main(String[] args) {
        try{
            System.out.println(9/0);

        }catch(ArithmeticException e){
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }finally{
            System.out.println("finally block always get execute regards less the exception is handle or not");
        }
        System.out.println("hello");
    }
}
