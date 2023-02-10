package day34_custom_classes.app;

public class App {

    String name;
    double version;
    boolean isFree;
    int rating;


//Creating update method:
    public void update(){

        System.out.println(name +" is updating");
        version += 0.1;
    }

    //making an instance method to print the way we want to print the object: conversing to String object
    public String toString(){
        return "Name: " +name + "\nVersion: " + version + "\n isFree: " + isFree + "\n Ratings: "+ rating;
    }

}
