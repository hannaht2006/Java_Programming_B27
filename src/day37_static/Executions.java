package day37_static;

public class Executions {

// to see the priority order the code run: static block always run first, end then follow the order from top to bottom

    public static void main(String[] args) {
        new Executions();// quick way to call construction; creat an object without reference
        System.out.println(1);
        new Executions();//print another 2 at the end
    }
    public Executions(){
        System.out.println(2);// don't run if we haven't called constructor..---> add :new Executions(); then 2 will be printed out at second position
    }
    static{
        System.out.println(3);// this block is run first -->3 is print out first
    }
}
