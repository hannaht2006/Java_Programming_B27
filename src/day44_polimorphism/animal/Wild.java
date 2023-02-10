package day44_polimorphism.animal;

public class Wild {
    public static void main(String[] args) {

        //Lizard objects with all references

        //reference itself
        Lizard lizard1 =  new Lizard();//->Eating from LIZARD

        //reference from super class
        Reptile lizard2 = new Lizard();//->Eating from LIZARD
        Animal lizard3 = new Lizard();//->Eating from LIZARD

        lizard1.eat();
        lizard2.eat();
        lizard3.eat();




    }
}
