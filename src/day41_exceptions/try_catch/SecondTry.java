package day41_exceptions.try_catch;

public class SecondTry {
    public static void main(String[] args) {

        try{
            int[] arr = {4, 2, 4, 1};
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("CATCH BLOCK");
            //there are two ways to print the exception message:
            e.printStackTrace();//print the problem out more detail than the below
            System.out.println(e.getMessage());//print the problem out
        }

    }
}
