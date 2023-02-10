package day12_switch.homework;

public class Elevator {
    /*
    add new class Elevator

declare and assign a floor number variable. The floor number represent which floor you want the elevator to go to. After getting to each floor show the information of which companies are on that floor. Use the following data:

	floor 1 --> Lobby, StarBucks, Amazon Pick Up
	floor 2 --> NASA, Cydeo, Discover
	floor 3 --> Uber, Lyft, Chase
	floor 4 --> Rooftop, Lounge

	any other floor value --> Invalid Floor Selected
     */
    public static void main(String[] args) {
        int  floor = 1;
        switch (floor){
            case 1 :
                System.out.println("Lobby, StarBucks, Amazon Pick Up");
                break;
            case 2 :
                System.out.println("NASA, Cydeo, Discover");
                break;
            case 3 :
                System.out.println("Uber, Lyft, Chase");
                break;
            case 4 :
                System.out.println("Rooftop, Lounge");
                break;
            default :
                System.out.println("Invalid Floor Selected");


        }
    }
}
