package day43_abstraction.cars;

public class Toyota extends Car{

    @Override
    public void start() {
        System.out.println("Turning the key to start");
    }
    //public void start(int a){
    //can you overload? YES, and only happen in the same class
    //}
}
