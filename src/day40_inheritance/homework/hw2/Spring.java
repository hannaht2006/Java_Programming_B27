package day40_inheritance.homework.hw2;

public class Spring extends Season{
    public Spring(double highestAverageTemp, double lowestAverageTemp){
        super("Spring", highestAverageTemp,lowestAverageTemp);
    }
    @Override
    public void activity(){
        System.out.println("Go Outside");
    }
}
