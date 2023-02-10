package day10_if_statements.homework;

public class Loan1 {
    public static void main(String[] args) {
        double creditScore = 800;
        String result = creditScore > 700 ? "Loan approved": "loan rejected. Sign up for our credit program";
        System.out.println(result);
    }
}
/*
? if
: else

the boolean creditScore > 700 is checked
if the boolean is true the value before the colon is returned : Loan approved
if the boolean is false the value after the colon is returned : sign up for our credit program
 */