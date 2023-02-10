package day16_string.homework;

public class Sms {
    /*
    [SMS parts] - We will do this together

Given a String in the following format:
Sender: <James Bond>. From Number: [202-123-3456]. + Message: {"I love programming and problem solving"}

Separate these parts and print them separately:
    Sender: actualSender
    Number: actualNumber
    Message: actualMessage
     */
    public static void main(String[] args) {

        String sms = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {\"I love programming and problem solving\"}";

        int indexSender1 = sms.indexOf('<');
        int indexSender2 = sms.indexOf('>');
        int indexphon1 = sms.indexOf('[');
        int indexphon2 = sms.indexOf(']');
        int indexmess1 = sms.indexOf('{');
        int indexmess2 = sms.indexOf('}');

        System.out.println("Sender: "+ sms.substring(indexSender1+1,indexSender2));
        System.out.println("Number: "+ sms.substring(indexphon1+1, indexphon2));
        System.out.println("message: "+ sms.substring(indexmess1+1, indexmess2));

    }
}
