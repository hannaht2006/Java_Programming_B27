package day41_exceptions.season;

public class Summer extends Season{

    public Summer(double highestTemp, double lowestTemp) {
        super("Summer", highestTemp, lowestTemp);
    }

    @Override
    public void activity() {
        System.out.println("Drink Lemonade");
    }
}
