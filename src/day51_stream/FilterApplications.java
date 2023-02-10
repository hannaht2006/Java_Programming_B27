package day51_stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FilterApplications {

    public static void main(String[] args) {
Application [] apps = {
        new Application("Jose Penso", 150_000, true),
        new Application("Ostap Kozik", 155_000, true),
        new Application("Ovsanna Abramyan", 250_000, false),
        new Application("Orkhan Samadzade", 500_000, false),
};

        System.out.println(Arrays.stream(apps).filter(person -> person.willingToRelocate).collect(Collectors.toList()));

        System.out.println(Arrays.stream(apps).filter(person -> person.willingToRelocate).map(p ->p.name).collect(Collectors.toList()));
//using getter method to getName
        System.out.println(Arrays.stream(apps).filter(person -> person.willingToRelocate).map(Application::getName).collect(Collectors.toList()));

  //line 18 and 20 are doing the same thing

        System.out.println(Arrays.stream(apps).filter(p -> p.expectedSalary <= 150_000).map(Application::getName).collect(Collectors.toList()));
    }
}

class Application {
    String name;
    double expectedSalary;
    boolean willingToRelocate;

    public Application(String name, double expectedSalary, boolean willingToRelocate) {
        this.name = name;
        this.expectedSalary = expectedSalary;
        this.willingToRelocate = willingToRelocate;
    }

    public String getName() {
        return name;
    }

    public double getExpectedSalary() {
        return expectedSalary;
    }

    public boolean isWillingToRelocate() {
        return willingToRelocate;
    }

    @Override
    public String toString() {
        return "application{" +
                "name='" + name + '\'' +
                ", expectedSalary=" + expectedSalary +
                ", willingToRelocate=" + willingToRelocate +
                '}';
    }
}