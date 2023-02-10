package day10_if_statements;

public class TernaryExample {
    public static void main(String[] args) {
        int score = 50;
        if (score>70) {
            System.out.println("Passing");
        }else {
            System.out.println("Failing");
        }
        System.out.println("---------------------");

        int score2 = 50;
        String result;
        if (score >70) {
            result = "Passing";
        }else {
            result = "Failing";
                }
        System.out.println(result);
        System.out.println("---------------");

        int score3 = 80;
        String result2 = score3 > 70 ? "Passing" : "Failing"; // storing the result to a string variable (if is ?; else is :)
        System.out.println(result2);
        System.out.println(score3 > 70 ?"Passing" : "Failing" );// printing the result right away

        System.out.println("---------------");
        int n = 9;
        System.out.println(n%2 ==0? "even": "odd");

        System.out.println("---------------");
        boolean isGreen = true;
        System.out.println(isGreen ? "Drive": "Stop");
        /*
        if(isGreen){
        System.out.println("Drive");
        } else{
        System.out.println("Stop");
        }
         */
        System.out.println("---------------");
        int num = 10;
        System.out.println(num > 0 ?"Positive": n<0 ? "Negative": "Zero");


    }




}
