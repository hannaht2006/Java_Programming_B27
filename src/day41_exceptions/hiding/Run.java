package day41_exceptions.hiding;

public class Run {

    public static void main(String[] args) {

        First.staticMethod();//access method in the First class ->Static method from First
        Second.staticMethod();//access method in the Second class-> Static method from Second

        System.out.println();

        new First().instanceMethodA();//calls the instance method, which is calling the static method inside. The closest method (same class) method is called (->Static method from First)
        //new First().instanceMethodB(); instance method B was created in the sub class Second
        new Second().instanceMethodA();//this instance method was inherited; it calls the closest static method (the one in the First class) -> Static method from First
        new Second().instanceMethodB();//this instance method is also calling the static method, the closest one is the one in the second class (-> Static method from Second)
    }
}
