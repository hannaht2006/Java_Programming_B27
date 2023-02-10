package day45_polymorphism.building;

import java.util.ArrayList;

public class BuildingMarket {
    public static void main(String[] args) {

//make ArrayList with Building type so can hold housr, apartmwnt and officebuilding object
        ArrayList<Building> allBuildings = new ArrayList<>();
        allBuildings.add(new House("New York", 400_000, 4));
        allBuildings.add(new Apartment("Texas", 3_000_000, 6));
        allBuildings.add(new OfficeBuilding("Virginia", 20_000_000, 6));
        allBuildings.add(BuildingUtil.search("Mclean"));//added the OfficeBuilding from the search method
        allBuildings.add(BuildingUtil.search("Great Falls"));

        Building mostExpensive = allBuildings.get(0); //just a default value

        for (Building each : allBuildings){//iterating through the Building objects from the allBuildings list
            if(each.price>mostExpensive.price){
                mostExpensive = each;
            }

        }
        System.out.println(mostExpensive);
      //  mostExpensive.numberOfFloors;// this does not compile because the reference is Building, but Building does not visibility to the variable

        System.out.println(((OfficeBuilding)mostExpensive).numberOfFloors);// casting down : reference of Building --> reference OfficeBuilding

        //Filter all the Buildings within certain price range
        ArrayList<Building> filterBuilding = new ArrayList<>(allBuildings);
        filterBuilding.removeIf(p-> p.price>=2_000_000 || p.price<= 300_000);

        System.out.println(filterBuilding);
    }
}
