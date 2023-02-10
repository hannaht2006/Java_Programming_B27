package day35_custom_classes.homework.food;

public class Restaurant {
    public static void main(String[] args) {

        Food salad = new Food ("romance", 3, 2.99);

        salad.calculationPrice();
        System.out.println(salad);
    }
}
