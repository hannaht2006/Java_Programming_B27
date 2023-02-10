package day18_loops.homework;

public class Factorial {
    public static void main(String[] args) {
        int num = 10;
        int n =1;
        int result=1;
        while(n <=10){
          result *= n;
            System.out.print(n+"*");
            n++;
        }
        System.out.println("= " + result);
    }
}
