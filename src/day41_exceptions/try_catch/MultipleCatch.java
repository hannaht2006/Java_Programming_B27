package day41_exceptions.try_catch;

public class MultipleCatch {
    public static void main(String[] args) {

        try{
            System.out.println(1/0);

            String s = null;
            s.trim();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());// -> / by zero

        } catch (NullPointerException e){
            System.out.println("Second catch block ");// ???? why doesn't catch the NullPointlnException
            e.printStackTrace();
        }

        System.out.println("END"); // this has nothing to do with any try catch

//        try{

//        }catch (StringIndexOutOfBounds | ArrayIndexOutOfBounds e){
//            System.out.println(e.getMessage());
//        }

    }
    }
