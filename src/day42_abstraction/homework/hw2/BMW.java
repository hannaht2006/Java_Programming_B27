package day42_abstraction.homework.hw2;

public class BMW extends Car{

    public BMW(String name, String type){
        super(name, type);
    }
    @Override
    public void start() {
        System.out.println("pressing button to start");
    }

    @ Override
    public String toString(){
        return super.toString();
    }
}
