package day34_custom_classes.app;

import day34_custom_classes.app.App;

public class AppStore {

    public static void main(String[] args) {

        App instagram = new App();
        instagram.name = "Instagram";
        instagram.version = 12.1;
        instagram.isFree = true;
        instagram.rating = 4;

        instagram.update();//calling the instance method by the object/reference
        //App : class
        //instagram: object/instance
        //update(): method

//        System.out.println(instagram.name);
//        System.out.println(instagram.version);
//        System.out.println(instagram.isFree);
//        System.out.println(instagram.rating);

        System.out.println(instagram); //now that we wrote the toString we can print the object

        System.out.println(instagram.toString());//toString turn gray means not necessary because toString is automatically called

    }
}
