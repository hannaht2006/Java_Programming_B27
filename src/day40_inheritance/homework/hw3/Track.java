package day40_inheritance.homework.hw3;

public class Track extends OlympicSport{

    public Track (int participants){
        super("Track", participants);
    }
    @Override
    public void compete(){
        System.out.println("Track for running, jumping, throwing");
    }
}
