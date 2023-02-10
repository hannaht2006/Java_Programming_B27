package day12_switch.homework;

import java.util.Scanner;

public class LaptopPrice {

    public static void main(String[] args) {
        double price = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Select screen size:");
        String screenSize = input.nextLine();
        switch (screenSize) {
            case "13.3":
                price += 200;
                break;
            case "15.0":
                price += 300;
                break;
            case "17.3":
                price += 400;
                break;
            default:
                System.out.println("your enter is not available");
                break;
        }

        System.out.println("Select CPU type:");
        String cpuType = input.nextLine();
        switch (cpuType) {
            case "i3":
                price += 150;
                break;
            case "i5":
                price += 250;
                break;
            case "i7":
                price += 350;
                break;
            default:
                System.out.println("your enter is not available");
                break;
        }

        System.out.println("Select RAM size:");
        int ram = input.nextInt();
        if (ram % 4 == 0) {
            price = price + (50 * (ram / 4));
        } else {
            System.out.println("invalid RAM input");
        }

        System.out.println("Select storage type:");
        String storage = input.next();

        System.out.println("Select storage size:");
        int size = input.nextInt();

        switch (storage) {
            case "HHD":
                if (size % 500 == 0) {
                    price = price + (50 * (size / 500));
                } else {
                    System.out.println("invalid input");
                }
                break;
            case "SSD":
                if (size % 500 == 0) {
                    price = price + (100 * (size / 500));
                } else {
                    System.out.println("invalid RAM input");
                }
                break;
            default:
                System.out.println("your enter is not available");
                break;
        }

        System.out.println("Select screen resolution:");
        String screenResolution = input.next();
        switch (screenResolution) {
            case "FULLHD":
                price += 100;
                break;
            case "4K":
                price += 200;
                break;
            default:
                System.out.println("your enter is not available");
                break;
        }
        System.out.println("Final price is:" + price);
    }
}

