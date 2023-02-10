package day41_exceptions.season;

public class Winter extends Season{

    public Winter(double highestTemp, double lowestTemp) {
        super("Winter", highestTemp, lowestTemp);
    }

    @Override
    public void activity() {
        System.out.println("Use Fireplace");
        System.out.println("Code Java");
    }
}
