package day40_inheritance.app;

public class App {
    /*
    Create an App class

    - create variables:
        name (app name), version

    - create constructor to initialize the variables

    - create method:
        download()
            Example output: prints $name is downloading version $version
*/
    String name;
    double version;

    public App (String name, double version){
        this.name = name;
        this.version = version;
    }

    public void download(){
        System.out.println( name +" is downloading version "+ version);
    }

    /*

Create a class Instagram

    - Instagram class inherits App class

    - create constructor to call parent constructor and set up variables (name and version)

    - create method:
        postPicture()
            Example output: prints Posting picture to Instagram
*/



}
