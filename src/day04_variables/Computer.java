package day04_variables;

public class Computer {
    public static void main(String[] args) {

        String brand, processor;
        byte ramMemory, storageMemory, numberOfUsbSlots;
        boolean hasMonitor, hasWifiCard, hasBluetooth;
        float price;

        brand ="Samsung";
        processor = "A 64-Core TR 3990X";
        ramMemory = 16;
        storageMemory = 8;
        numberOfUsbSlots = 4;
        hasMonitor = true;
        hasWifiCard = true;
        hasBluetooth = true;
        price = 1_200;

        System.out.println("Summary of Computer Information"+"\nbrand = " + brand+ "\nprocessor = " + processor +
        "\nramMemory ="+ ramMemory+
                "\nstorageMemory = "+ storageMemory + "GB" +
                "\nnumberOfUsbSlots = "+ numberOfUsbSlots +
                "\nhasmonitor = "+ hasMonitor +
                "\nhasWifiCard =" + hasWifiCard +
                "\nhasBuetooth = " + hasBluetooth +
                "\nprice = " +price);

    }
}
