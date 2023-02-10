package day44_polimorphism.hw.partone_setup;

public class PartTwo_UsingPolymorphism {
    public static void main(String[] args) {
        //references from its class
        House house1 = new House("Fairfax", 450000, 2000);
        System.out.println(house1);
        house1.pay();
        house1.mowLawn();

        //references from super class
        Building house2 = new House("Centreville", 500_000,3000);

        //House house3 = new Building("manassas", 350_000);

    }
}
/*
Create the objects of the House using all these references and check what the object has access to:
        House, Building, HasBackyard

For more practice about references do the same task for Apartment and OfficeBuilding for all their references of itself, super class, and interface

With Method:

    create a class BuildingUtil

    create a static method Rent(Building obj)
        return: double
        parameters: Building type

        implementation:
            if the Building is House type return 1500
            if the Building is Apartment type return 800
            if the Building is OfficeBuilding type return 2000

    create a static method search(String location)
        return: Building
        parameters: String location

        implementation
            if the location is Great Falls return a House object with:
                location: Great Falls
                price: 500_000
                number of residents: 4

            if the location is FairFax return a Apartment object with:
                location: FairFax
                price: 250_000
                month for lease: 6

            if the location is McLean return a OfficeBuilding object with:
                location: McLean
                price: 2_000_000
                number of floors: 6

    Run the methods in a main method to test them out
 */