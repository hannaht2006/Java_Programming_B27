package day39_inheritance.access.b;

import day39_inheritance.access.a.House;

public class TownHouse extends House {

    public static void main(String[] args) {
        //Q: what the TownHouse inherit from House?

        //in different package
        TownHouse house = new TownHouse();
        house.address = "46878 r";
        house.city = "Fairfax";// protected String city;from House class
        System.out.println(house.city);

        //did i inherit the city variable?  YES
        // house.state; state is default, so only accessible in the same package
        //  house.zipcode; zipcode is private, so only accessible in the same class
    }
}
