package day04_variables;

public class CellPhone {
    public static void main(String[] args) {

        String branch = "Apple";
        String model = "IPhone X";
        String color = "Rose Gold";
        double price = 1000.99;
        boolean hasCamera = true;
        int size = 128;
        char sim = 'A';
        System.out.println("\t\tPhone information:\nbranch: "+branch);
        System.out.println(model +" in "+color);
        System.out.println("with " + size + "gb the price is $ " + price);
        System.out.println("sim type: " + sim + ", and has camera: " + hasCamera);

        //alternative solution:
        String report = "\t\tPhone information:\nbranch: "+branch + "\n" +model +" in "+color +
        "\nwith " + size + "gb the price is $ " + price +
                "\nsim type:" + sim+" and has camera:" + hasCamera;

        System.out.println("\n"+ report);


    }
}
