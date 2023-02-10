package day37_static.car;

public class Street {
    public static void main(String[] args) {

        Car bmw = new Car("X5", "James",3128323, 'c');
        System.out.println(bmw.driver);
        System.out.println(bmw.driver.name);//-> James
        System.out.println(bmw.model);//accessing instance variable ->X5

    }
}
