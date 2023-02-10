package day20_loops;

public class LoopStatements {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            System.out.print(i + " ");

        }

        System.out.println();
        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                break;// the loop stops when i==2 ---> only print 1
            }
            System.out.print(i + " ");
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                continue;//will skip the current steps when i==2 --> not print 2
            }
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;//
            }
            System.out.print(i + " ");

        }
    }
}
