package day42_abstraction.homework.hw1;

public class Library {
    /*
    Create a class Library

    create a method getLibraryCard(String city)

        if the city is Fairfax or McLean print Library Card Created

        but if it is any other city throw your NonResidentException
            -> give a message in the constructor call

            create a method borrow(boolean checkedOut)

        if the given checkedOut boolean is true print "Enjoy reading"

        but if the boolean is false throw your FailToCheckOutException

        -> handle this exception in the runner file

     */
    public static String getLibraryCard(String city){

        String result = "";
        if (city.equals("Fairfax")|| city.equals("Mclean")){
             result ="you are resident, library card is created";
        }else{
            throw new NonResidentException();

        }
        return result;
    }
    public static String borrow(boolean checkedOut) throws FailToCheckOutException{
        String s= "";
        if (checkedOut==true){
            s ="Enjoy reading";
        }else{
            throw new FailToCheckOutException();
        }
        return s;
    }
}
