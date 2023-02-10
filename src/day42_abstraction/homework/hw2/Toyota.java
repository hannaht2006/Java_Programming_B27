package day42_abstraction.homework.hw2;

public class Toyota extends Car{

    public Toyota(String name, String type){
        super(name, type);
    }

    @Override
    public void start() {
        System.out.println("turning key to start");
    }
    @ Override
    public String toString(){
        return super.toString();
    }
}
