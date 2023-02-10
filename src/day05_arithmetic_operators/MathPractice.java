package day05_arithmetic_operators;

public class MathPractice {
    public static void main(String[] args) {
        System.out.println(4+5);
        System.out.println(4*5);

        // int*int -->int
        System.out.println(2*5);

        //int*double --> double
        System.out.println(2*5.5);

        //int/int ----> int
        System.out.println(10/3);

        //int/double ---> double
        System.out.println(10/3.0);
        System.out.println(5%2);// 2+2 -> 2 went into 5 twice, there is 1 left over --> result is 1 remainder
        System.out.println(4%2);//no left over because 2 divides into 4 evenly --> result is 0 remainder

        System.out.println(4%10);//4/10 not enough to have a whole 10, 4 is the left over. (if the first number is greater that the second number, the result (remainder) will be the first number)




    }
}
