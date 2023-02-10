package day05_arithmetic_operators;

public class Pizza {
    public static void main(String[] args) {
        String type = "cheese";
        int pizzaSlices = 10;
        int people = 3;
        int slicesPerPerson = pizzaSlices/people;
        int leftOverSlices = pizzaSlices%people;
        System.out.println(people +" people are going to eat the " +type + " pizza. Every person will get "+slicesPerPerson + " Slices and there will be "+leftOverSlices + " left over");

    }
}
