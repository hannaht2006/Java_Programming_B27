package day42_abstraction.exercise;

public class Gym {
    public static void main(String[] args) {

      //  Exercise obj = new Exercise(); is not valid because Exercise is abstract - cannot create object from it

        Running run = new Running();
        run.perform();
        run.getCaloriesBurned(30);
    }
}
