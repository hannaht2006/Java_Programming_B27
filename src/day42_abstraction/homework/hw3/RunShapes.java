package day42_abstraction.homework.hw3;

public class RunShapes {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Circle", 2);
        System.out.println(circle1);
        circle1.calculateArea();
        circle1.calculatePerimeter();
    }
}
