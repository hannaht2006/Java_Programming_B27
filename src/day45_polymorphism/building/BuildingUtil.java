package day45_polymorphism.building;

public class BuildingUtil {
    public static void main(String[] args) {

        //reference from itself:
        House house1 = new House("Paris", 100_000, 10);

        //reference from super
        Building house2 = new House("New York", 2000000, 4);

        //reference from interface
        HasBackyard house3 = new House("Seatle", 300000, 5);
        //house3.pay(); invalid : cannot use pay() mehtod since interface HasBackyard doesn't have access to pay() method

        house3.mowLawn();//mowLawn() method is valid to call
       //call rent() method:
        System.out.println(rent(house1));
        System.out.println(rent(new OfficeBuilding("Texas", 123000, 4)));
        System.out.println(rent(new Apartment("Fairfax", 20000, 50)));

        System.out.println(search("Fairfax"));
        System.out.println(search("Mclean"));

    }

// make a static rent() method:
    public static double rent(Building building) {
        if (building instanceof House) {
            return 1500;
        } else if (building instanceof Apartment) {
            return 800;
        } else if (building instanceof OfficeBuilding) {
            return 2000;
        } else {
            return -1;
        }
    }

    //create a static method with Building type
    public static Building search(String location){
        if (location.equals("Great Falls")){
            return new House("Great Falls", 500_000, 4);
        }else if(location.equals("Fairfax")){
            return new Apartment("Fairfax", 250_000, 6);
        }else if (location.equals("Mclean")){
            return new OfficeBuilding("Mclean", 2000_000, 6);
        }
        return null;
    }
}