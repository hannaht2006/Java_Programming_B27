package day41_exceptions.person;

public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age < 0  || age > 120){
        throw new IllegalArgumentException("age should not be less than zero or greater than 120");
        }
        this.age = age;
    }
}
