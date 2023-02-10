package day34_custom_classes.housing;

public class House {

    String type;
    double sqft;
    int numberOfBedrooms;
    int numberOfBathrooms;
    boolean inCity;
    boolean hasGarage;

    public double calculateMortgage(){
        if (numberOfBathrooms < 2){
            return 1500;

        }else if (numberOfBathrooms < 4){
            return 2000;
        }else{
            return 2500;
        }
    }


    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", sqft=" + sqft +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                 ", "+
                (inCity? "inthe city": "in the Suburbans")+ ", " + (hasGarage ? " has garage": " no garage. Street parking");//don't want to print true or false, used if  else to print out ....
    }
}
/*
original
 public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", sqft=" + sqft +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", inCity=" + inCity +
                ", hasGarage=" + hasGarage +
                '}';
    }
 */