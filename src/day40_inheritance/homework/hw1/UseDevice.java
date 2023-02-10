package day40_inheritance.homework.hw1;

public class UseDevice {
    public static void main(String[] args) {
        TV tv = new TV(1100.99);
        System.out.println(tv);
        tv.useDevice();

        Phone phone = new Phone(2000.99);
        System.out.println(phone.price);
        System.out.println(phone);
        phone.useDevice();

    }
}
