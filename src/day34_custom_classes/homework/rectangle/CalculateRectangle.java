package day34_custom_classes.homework.rectangle;

public class CalculateRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.base = 12.5;
        rectangle1.height = 6.5;

        rectangle1.calculatePerimeter();
        rectangle1.calculateArea();

        System.out.println(rectangle1);


    }
}
