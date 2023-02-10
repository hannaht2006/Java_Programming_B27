package day39_inheritance.homework.hw3;

public class DisCordUser {
    /*
    Create an DiscordUser class

    - create variables:
        role, name, id

    - create constructor to initialize the variables

    - create a toString() method

Create a class Admin

    - Admin class inherits DiscordUser class

    - create constructor to call parent constructor and set up variables (role - Admin, name, id)

    - create method:
        createChannel()
            Example output: prints Creating new discord channel

Create a class Student

    - Student class inherits DiscordUser class

    - create constructor to call parent constructor and set up variables (role - Student, name, id)

    - create method:
        sendMessage()
            Example output: prints Sending message to class chat
     */

    String role;
    String name;
    int iD;

    public DisCordUser(String role, String name, int iD) {
        this.role = role;
        this.name = name;
        this.iD = iD;
    }

    @Override
    public String toString() {
        return "DisCordUser{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", iD=" + iD +
                '}';
    }
}
