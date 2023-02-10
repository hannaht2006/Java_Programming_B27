package day21_nested_loops.homework;

public class ShapeSquare {
    /*
    Print these shapes:

    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
     */
    public static void main(String[] args) {
        for (int i = 0; i <=8; i++){
            for (int j = 0 ;j <= 8; j++ ){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
