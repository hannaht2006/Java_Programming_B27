package day44_polimorphism.employee;

public class Tester extends  Employee implements CreateSmokeTest{
    public Tester(String name, String jobTitle, double salary) {
        super(name, jobTitle, salary);
    }
    @Override
    public void work() {
        System.out.println("running test cases");
    }

    @Override
    public void create() {

    }

    public void writeBugReport(){
        System.out.println("Found bug, writing report");
    }
}
