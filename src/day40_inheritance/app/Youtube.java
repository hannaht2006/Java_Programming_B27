package day40_inheritance.app;

public class Youtube extends App{
     /*
    Create a class Youtube

    - Youtube class inherits App class

    - create constructor to call parent constructor and set up variables (name and version)

    - create method:
        watchVideo()
            Example output: prints Watching java tutorial
     */
    public Youtube (double version){
        super("Youtube", 0.4);
    }

    public void watchVideo(){
        System.out.println("Watching java tutorial");
    }
}
