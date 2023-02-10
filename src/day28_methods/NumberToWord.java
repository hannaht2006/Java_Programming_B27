package day28_methods;

public class NumberToWord {

    /*
    5 --> five
     */
    public static void main(String[] args) {
        System.out.println(numberToWord(1));
        System.out.println(numberToWord2(3));
        System.out.println(numberToWord2(7));

        String str = numberToWord2(5);
        System.out.println(str);
    }

    public static String numberToWord (int n){
        String word = "";
        switch (n){
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            case 8:
                word = "eight";
                break;
            case 9:
                word = "nine";
                break;
            default:
                word = "Invalid. We only accept number from 1-9";

        }
        return word;
    }
    public static String numberToWord2 (int n){

        switch (n){
            case 1:
                return "one";

            case 2:
                return "two";

            case 3:
                return "three";

            case 4:
                return "four";

            case 5:
                return "five";

            case 6:
                return "six";

            case 7:
                return "seven";

            case 8:
                return "eight";

            case 9:
                return "nine";
        }
        return "Invalid. We only accept munber from 1-9"; // at the end or in default case are both fine
}}
