package day42_abstraction.exercise;

public class Running extends Exercise{

    @Override
    public void perform(){
        System.out.println("We are running");
    }
    @Override
    public void getCaloriesBurned(int minutes){
        System.out.println(minutes * 0.35);
    }
}
/*
Running is a Exercise
Running is non-abstract (normal class)
Running is the first non-abstract class it is the concrete class

concrete classes must implement(override) all the abstract methods
 */