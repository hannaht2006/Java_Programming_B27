package day15_string;

import java.util.Scanner;

public class ValidWebsite {
    /*
    declare a String for the website and check if it is valid website should start with : www.
    website should end with one of the following :
    .com
    .edu
    .gov
    .net
    valid website or invalid website
    bonus: why the website is invalid

     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the website name:");
        String website = input.next();

        boolean validStart = website.startsWith("www");
        boolean validEnd = website.endsWith(".com") ||website.endsWith(".edu")||website.endsWith(".gov")||website.endsWith(".net");
       // startsWith and endsWith will return boolean type --> can not use as String type
        if (validStart && validEnd) {
            System.out.println(website + " is valid");

        }
        else {
            System.out.println(website + " is invalid website");
            if (!validStart)   {
                System.out.println("website should start with www.");
            }
            if (!validEnd){
                System.out.println("website should end with .com or .edu or .gov or .net");
            }
        }

        System.out.println("---------------");
        System.out.println(validEnd && validStart? "valid website": "in valid website");
    }
}
