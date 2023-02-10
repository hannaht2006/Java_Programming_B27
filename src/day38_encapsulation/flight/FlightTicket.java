package day38_encapsulation.flight;

public class FlightTicket {
    /*
    declare these instance variables:
    type (first, business, economy)
    departure  location/airport
    arrival    location/airport

    encapsulate all of them
    creat constructor to set up the object
    note: should only be first, business or economy
     */

    private String type;

    String departure;
    String arrival;

    public FlightTicket(String type, String departure, String arrival) {
        setType(type);//calling setter method because type is private variable
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(type.equalsIgnoreCase("first")|| type.equalsIgnoreCase("business")||type.equalsIgnoreCase("economy")){
            this.type = type;
        }
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
}
