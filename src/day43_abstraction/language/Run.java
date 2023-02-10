package day43_abstraction.language;

public class Run {
    public static void main(String[] args) {
    //   Language obj = new Language(); cannot create object of interface
           English obj = new English();
           obj.hello();
           obj.bye();

           Spanish obj2 = new Spanish();
           obj2.hello();
           obj2.bye();

    }
}
