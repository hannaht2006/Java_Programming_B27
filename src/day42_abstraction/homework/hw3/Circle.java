package day42_abstraction.homework.hw3;

public class Circle extends Shape {

    double radius;
    public Circle (String name, double radius){
        super("Circle");
        this.radius = radius;

    }

    @Override
    public void calculateArea() {
        System.out.println("Area= "+ (radius*radius*Math.PI));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter= "+ 2*Math.PI*radius);

    }

    @Override
    public String toString() {
        return super.toString()+"\n"+ name+ "\nRadius= "+radius;
    }
}
