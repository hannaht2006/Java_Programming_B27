package day09_if_statements;

import java.util.Scanner;

public class Survey {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Are you a student? T/F");
        boolean isStudent = input.nextBoolean();
        String report = ""; //empty space, String type

        if (isStudent){
            System.out.println("What are you studying? ");
            String subject = input.next();
            report += "Studying: "+ subject;

        }
        System.out.println("Do you live in a city? T/F");
        if(input.nextBoolean()){ //just using boolean from scanner right away instead of storing into a boolean variable
            System.out.println("Cool, cities are loud and fun");
        }else{
            System.out.println(" How many years have you lived in the suburb? ");
            int years = input.nextInt();
            report += "\nLiving in suburb for " +years +"years";


        }
        System.out.println(report);
        input.close();


    }
}
/*
+=
int a =9;
a+=5; // a=a+5 = 9+5

String s = "java";
s+= "scrip"; // s = s+ "scrip"
 */