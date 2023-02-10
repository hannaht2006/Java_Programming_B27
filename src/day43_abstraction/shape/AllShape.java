package day43_abstraction.shape;

public class AllShape {
    public static void main(String[] args) {

       // Shape obj =  new Shape();
        Circle obj =  new Circle((4.6));
        System.out.println(obj);
        System.out.println(obj.area());
        System.out.println(obj.perimeter());

        System.out.println(obj.name);
        System.out.println(obj.radius);

        //not be able to change name and radius since they are final
        // obj.radius = 412;
        //obj.name = "Other shape";

    }
}
