package day40_inheritance.homework.hw3;

public class Soccer extends OlympicSport{

    public Soccer(int participants){
        super("Soccer", participants);
    }

    @Override
    public void compete(){
        System.out.println("Playing a soccer game");
    }
}
