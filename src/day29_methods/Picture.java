package day29_methods;

public class Picture {

    public static void main(String[] args) {
        draw();
        draw("red");
        draw(10);
        draw("hello", "world");
    }
    public static void draw(){
        System.out.println("Drawing circle");
    }
    public static void draw(String color){
        System.out.println("Drawing with "+ color);
    }
    public static void draw(int size) {
        System.out.println("making picture of " + size);
    }
    public static void draw(String s, String s2){
        System.out.println("Drawing with two Strings " + s + " "+s2);
    }
    public static void draw(String s, int a){

    }
    public static void draw(int a, String s){

    }
}
