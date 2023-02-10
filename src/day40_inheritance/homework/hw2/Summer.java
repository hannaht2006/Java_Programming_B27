package day40_inheritance.homework.hw2;

public class Summer extends Season{

    public Summer(double highestAverageTemp, double lowestAverageTemp){
        super("Summer",highestAverageTemp,lowestAverageTemp );
    }
    @Override
    public void activity(){
        System.out.println("Drink Lemonade");
    }

}
