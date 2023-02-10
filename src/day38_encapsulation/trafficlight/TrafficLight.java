package day38_encapsulation.trafficlight;

public class TrafficLight {

    private String color;

    public TrafficLight(String color){ //constructor
        setColor(color); //calling a setter method inside constructor
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        if(color.equals("green")|| color.equals("red")||color.equals("yellow")){
            this.color = color;
        }//if this boolean is false (not valid color) then nothing is assigned to the color variable

    }
}
