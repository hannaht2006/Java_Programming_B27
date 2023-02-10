package day27_methods;

public class Parameters {

    public static void greeting (String name){ // name in the parameter, variable used in the method
        System.out.println("Hello "+ name);
        System.out.println("Nice to meet you " + name);
    }

    public static void age (int birthYear){
        System.out.println("You are "+ (2022 -birthYear) + " year old");
    }

    public static void main(String[] args) {
        greeting("James"); // James is an argument, value of the name for method
        greeting("Kelly");

        age(2000);
        age(1987);
    }
}
