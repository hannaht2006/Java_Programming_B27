package day10_if_statements;

public class IfWithNoBrackets {
    public static void main(String[] args) {

        if (3<9){
            System.out.println("First");
            System.out.println("Second");
        }
        if (3>9)
            System.out.println("Third"); // this is the line executed when the if statement is true

            System.out.println("Forth"); // this is not a part of the if statement

        System.out.println("---------------");

        if (5%2==0)
            System.out.println("Even");
        else
            System.out.println("odd");

        System.out.println("---------------");

        char a = 'a';

        if (a =='a')
            System.out.println("Letter a");
        else if (a =='b')
            System.out.println("Letter b");
        else if (a=='c')
            System.out.println("Letter c");
        else
            System.out.println("other");

    }
}
