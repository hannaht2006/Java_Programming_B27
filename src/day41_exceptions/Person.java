package day41_exceptions;

public class Person {
    String name = "James Bond";
}
class SecretIdentity extends Person{

    String name = "dnobsemai";//doing variable hiding, the original one, is hidden, but now i have a new variable with the same name
}
class Runner{
    public static void main(String[] args) {
        //could I have declared as a normal reference then access the variable. Yes but just to show quickly we made objects without reference
        System.out.println(new Person().name);
        System.out.println(new SecretIdentity().name);
    }
}


