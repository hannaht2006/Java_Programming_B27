package day17_strings;

public class SmsParts {
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

        String message = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {\"I love programming and problem solving\"}\n";

        int startSender = message.indexOf('<');
        int endSender = message.indexOf('>');

        int startNumber = message.indexOf('[');
        int endNumber = message.indexOf(']');

        int startMess = message.indexOf('{');
        int endMess = message.indexOf('}');

        String sender = message.substring(startSender+1, endSender);
        String phone = message.substring(startNumber+1, endNumber);
        String mess = message.substring(startMess+1, endMess);

        System.out.println("Sender: "+ sender);
        System.out.println("Phone number: "+ phone);
        System.out.println("Message: "+ mess);






    }
}
