package day42_abstraction.person;

public final class Tester extends Employee { // will be concrete class -> don't put abstract


    public Tester(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("Running test cases");
        System.out.println("Finding locators");

    }

    @Override
    public void sleep(int hour) {
        System.out.println("Tester sleeps for "+hour+" while the automation code runs");

    }
}
