package day39_inheritance.homework.hw3;

public class Admin extends DisCordUser{

    public Admin(String name, int iD){
        super("Admin", name, iD);
    }
    public void createChannel(){
        System.out.println("Creating new discord channel");
    }
}
