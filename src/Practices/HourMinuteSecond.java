package Practices;
import java.util.Scanner;
public class HourMinuteSecond {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int inputSeconds, hours, minutes, seconds;
        System.out.println ("Enter seconds: ");
        inputSeconds = input.nextInt();
        hours = inputSeconds/3600;
        minutes = (inputSeconds%3600)/60;
        seconds =(inputSeconds%3600)%60;
        System.out.println(hours+ " hours, "+ minutes + " minutes, and " +seconds + " seconds");


    }

}
