package day27_methods.homework;

public class MethodEvenAndOdd {
    /*
    create a method that can print odd numbers between 1-100 in the
same line saperated by space

create a method that can print even numbers between 1-100 in the
same line saperated by space

     */

    public static void evenNum (){
        String evenNum ="";
        for (int i= 1; i<=100; i++){
            if (i % 2 ==0){
              evenNum += ""+ i;
                System.out.print(i+" ");
            }
        }
    }
    public static void oddNum (){
        String oddNum ="";
        for (int i= 1; i<=100; i++){
            if (i % 2 ==1){
                oddNum += ""+ i;
                System.out.print(i+" ");
            }
        }
    }

    public static void main(StringCheck[] args) {
        evenNum();
        System.out.println();
        oddNum();
    }
}
