package day06_relational_operators;

public class BuyHouse {
    /*
    create a class BuyHouse

    declare and assign a credit score variable
    declare and assign a salary

    determine if you can get a loan to buy a house
    there is two ways to get a loan:
        credit score of 720 or above and salary of 100,000 or above
        credit score of 740 or above and salary of 80,000 or above
     */
    public static void main(String[] args) {
        int creditScore = 720;
        double salary = 110_000;

        boolean isGetALoan1 = creditScore >=720 && salary >= 100000;
        boolean isGetALoan2 = creditScore >=740 && salary >= 80000;
        boolean canGetLoan = isGetALoan1 || isGetALoan2;

        System.out.println("I can get a Loan : "+ canGetLoan);
    }
}
