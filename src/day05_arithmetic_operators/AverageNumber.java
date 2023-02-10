package day05_arithmetic_operators;

public class AverageNumber {
    /*
    create a class AverageNumber, and write a program that will define 4 scores and find the average of the scores

     */

    public static void main(String[] args) {

        double score1 = 10.5,
                score2 = 5,
                score3 = 8.5,
                score4 = 7;
        double totalScore = score1+score2+score3+score4;
        double averageScore = totalScore/4;
        System.out.println(averageScore);

    }
}
