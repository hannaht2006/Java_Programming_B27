package day39_inheritance.computer;

public class Lab {
    public static void main(String[] args) {
        Mac computer1 = new Mac (1000);
        System.out.println(computer1);

        Window computer2 = new Window (2000);
        System.out.println(computer2);
    }
}