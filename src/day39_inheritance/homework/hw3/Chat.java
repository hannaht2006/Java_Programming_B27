package day39_inheritance.homework.hw3;

public class Chat {
    public static void main(String[] args) {

        Admin admin1 = new Admin("Adam", 123345);
        admin1.createChannel();
        System.out.println(admin1);

        Student student1 = new Student("Cat", 78901);
        System.out.println(student1);
        student1.sendMessage();
    }
}
