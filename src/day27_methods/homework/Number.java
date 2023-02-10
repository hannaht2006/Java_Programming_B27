package day27_methods.homework;

public class Number {
    /*
    check if number positive, negative, zero
     */
    public static void checkNumber(int num){
        if (num >0){
            System.out.println(num + " is positive");
        }else if (num <0){
            System.out.println(num + " is negative");
        }else if (num == 0){
            System.out.println(num + " is zero");
        }
    }

    public static void main(String[] args) {

        checkNumber(-14);
    }
}
