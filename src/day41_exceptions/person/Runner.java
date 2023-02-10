package day41_exceptions.person;

public class Runner {
    public static void main(String[] args) {

        Person object = new Person();
        object.setName("James");
        object.setAge  (21);
        System.out.println(object);

        Person object2 = new Person();
        object2.setAge(-30);
        System.out.println(object2);
    }
}
