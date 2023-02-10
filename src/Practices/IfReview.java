package Practices;

public class IfReview {
    public static String name;

    static{
        name = "yona";
    }

    public static void main(String[] args) {
        IfReview ifReview = new IfReview();
        ifReview.name = "yoyo";

        IfReview newIfReview = new IfReview();
        newIfReview.name = "nana";

        IfReview lastIfReview = new IfReview();
        System.out.println(lastIfReview.name);
    }
}
