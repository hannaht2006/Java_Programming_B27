package day27_methods;

public class Car {
    /* algorithm for using car:
    unlock car
    open door
    sit down & start
    check mirrors
    seatbelt
    adjust seat
    put to drive and go
    make method for each of them, and then you can call them

     */
    public static void unlock(){
        System.out.println("Unlocking Car");
    }

    public static void openDoor (){
        System.out.println("Opening the door");
    }

    public static void sitDownAndStart (){
        System.out.println("Seating down in seat");
        System.out.println("Then insert the key");
        System.out.println("Start the car");
    }

    public static void checkMirros (){
        System.out.println("Checking left mirror");
        System.out.println("Checking rear mirror");
        System.out.println("Checking right mirror");
    }

    public static void putOnSeatbelt (){

        System.out.println("Putting on seatbelt");
    }

    public static void drive (){
        System.out.println("Putting into drive");
        System.out.println("Pressing on the accelerator");
    }

    public static void late(){ // calling other methods to use in late method
        unlock();
        openDoor();
        sitDownAndStart();
        drive();
    }

    public static void main(String[] args) {

        unlock();
        openDoor();
        sitDownAndStart();
        checkMirros();
        putOnSeatbelt();
        drive();

        System.out.println("-----------");

        late();
    }

}
