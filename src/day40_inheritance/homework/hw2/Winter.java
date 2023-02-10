package day40_inheritance.homework.hw2;

public class Winter extends Season{

        public Winter (double highestAverageTemp, double lowestAverageTemp) {
            super("Winter", highestAverageTemp,lowestAverageTemp);

    }
    @Override
    public void activity(){
        System.out.println("Use Fireplace");
    }
}
