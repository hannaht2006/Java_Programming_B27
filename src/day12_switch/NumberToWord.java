package day12_switch;

public class NumberToWord {
/*
number from 1-5
convert the number to number word
1--> one
2---> Two

 */
    public static void main(String[] args) {

        int number =3;
        switch (number){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Number should be between 1-5");
                //don't need to have "break" when default at the bottom of the code.


        }
    }
}

