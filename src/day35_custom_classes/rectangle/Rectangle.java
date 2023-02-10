package day35_custom_classes.rectangle;

public class Rectangle {
    double base;
    double height;
    double perimeter;
    double area;

    public void calculatePerimeter(){ // instant method doesn't have "static"
        perimeter = 2*base + 2*height;
    }

    public void calculateArea(){
        area = base*height;
    }


    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
