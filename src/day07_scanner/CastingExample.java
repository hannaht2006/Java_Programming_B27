package day07_scanner;

public class CastingExample {
    public static void main(String[] args) {
        /*
        create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;
         */
        float averageScore = 20.5F; // 20.5 is double by default, we are trying to store a double to a float, which is not ok because float is smaller, but we can add F to the end of the number to tell the compiler this is a float number, not a double number
        byte num1 = (byte)averageScore;//float is bigger than byte, so we need to cast
        short num2 = (short)averageScore;
        int num3 = (int)averageScore;
        long num4 = (long)averageScore;
        float num5 = averageScore;
        double num6 = averageScore;



    }
}
