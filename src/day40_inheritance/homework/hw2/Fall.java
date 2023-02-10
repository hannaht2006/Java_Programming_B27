package day40_inheritance.homework.hw2;

public class Fall extends Season{
    public Fall(double highestAverageTemp, double lowestAverageTemp){
        super("Fall", highestAverageTemp,lowestAverageTemp);
    }
    @Override
    public void activity(){
        System.out.println("Read A Book");
    }
}
