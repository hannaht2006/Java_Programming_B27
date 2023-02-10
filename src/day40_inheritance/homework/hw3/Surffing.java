package day40_inheritance.homework.hw3;

public class Surffing extends OlympicSport{

        public Surffing (int participants){
            super("Surffing", participants);
        }
    @Override
    public void compete(){
        System.out.println("Surfing the waves");
    }
}
