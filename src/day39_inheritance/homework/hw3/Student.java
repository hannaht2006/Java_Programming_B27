package day39_inheritance.homework.hw3;

public class Student extends DisCordUser{

    public Student (String name, int iD){
        super ("Student", name, iD);
    }

    public void sendMessage(){
        System.out.println("Sending message to class chat");
    }

}
