package day21_nested_loops;

public class NestedLoop2 {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++){

            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
