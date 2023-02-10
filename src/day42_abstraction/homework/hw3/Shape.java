package day42_abstraction.homework.hw3;

public abstract class Shape {

   final String name;

    public Shape (String name){
       this.name = name;
   }
    public abstract void calculateArea();
    public abstract void calculatePerimeter();

    @Override
    public String toString() {
        return "Shape name= " + name;
    }

    /*
    Create an abstract class Shape

    define a final variable name

    define a constructor to initialize the name of the shape

    define two abstract methods:

        area()
        perimeter()

    override the toString to return the name, area and perimeter

Create a concrete class Circle
    sub class of Sharpe

    create an instance variable radius

    call the parent constructor to set the name of the shape to "Circle" & initialize the radius value for the circle

    implement the two abstract methods for a circle shape

        area()
        perimeter()

    override the toString to return the name, area, perimeter, and radius

Create a concrete class Rectangle
    sub class of Sharpe

    create an instance variable length
    create an instance variable width

    call the parent constructor to set the name of the shape to "Rectangle" & initialize the length and width values for the shape

    implement the two abstract methods for a rectangle shape

        area()
        perimeter()

    override the toString to return the name, area, perimeter, length, and width
     */
}
