package day06_relational_operators;

public class Walking {
    /*
    create a class Walking
  declare and assign a boolean variable is raining
  declare and assign a temperature variable
  check if you should go for a walk. You should go for a walk if it is not raining and the temperature is more than 68
     */
    public static void main(String[] args) {
        float temp = 50F;
        boolean notRaining = true;
        boolean walkingTemp = temp>=68;
        boolean goForWalk = notRaining && walkingTemp;
        System.out.println("Go for a walk : "+ goForWalk);

    }
}
