package day21_nested_loops.homework;

public class ShapeTriangle {
    /*
    Print this shape:

    * * * * * * * *
    * * * * * * *
    * * * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
     */
    public static void main(String[] args) {
        for (int i = 8; i >=0; i--){
            for ( int j = 0; j < i; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
