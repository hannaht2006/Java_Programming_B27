package day27_methods.homework;

public class MethodChar {
    /*
    Character Methods

    Print each one in one line

    - make method that will print all the letters from A to Z

    - make method that will print all the letters from a to z

    - make method that will print all the letters from Z to A

    - make method that will print all the letters from z to a

    - make method that will print all the letters from 0 to 9

     */
    public static void letterAToZ(){
        String letter = "";

        for(char i='A'; i<='Z'; i++ ){
            letter += " "+i;
        }
        System.out.print(letter + "");
    }
    public static void letteraToz(){
        String letter = "";

        for(char i='a'; i<='z'; i++ ){
            letter += " "+i;

        }
        System.out.print(letter );
    }
    public static void letterZToA(){
        String letter = "";

        for(char i='Z'; i>='A'; i-- ){
            letter += " "+i;

        }
        System.out.print(letter );
    }
    public static void letterzToa(){
        String letter = "";

        for(char i='z'; i>='a'; i-- ){
            letter += " "+i;

        }
        System.out.print(letter );
    }
    public static void letter0To9(){


        for(int i=0; i<10; i++ ){

            System.out.print(" "+ (char)i );
        }
    }
    public static void main(StringCheck[] args) {
       letterAToZ();
        System.out.println();
       letterZToA();
        System.out.println();
       letteraToz();
        System.out.println();
       letterzToa();
        System.out.println();
        letter0To9();
    }
}
