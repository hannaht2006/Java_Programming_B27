package day38_encapsulation.trafficlight;

public class Driving {

    public static void main(String[] args) {
        TrafficLight road1 = new TrafficLight("red");
        System.out.println(road1.getColor());//road1.color is not valid

      road1.setColor("blue");
       System.out.println(road1.getColor());//there is no "blue" -> red

      road1.setColor("green");
      System.out.println(road1.getColor());

    }






}
