package day37_static.car;

public class Driver {

    String name;
    long licenseNumber;
    char licenseType;

    public Driver(String name, long licenseNumber, char licenseType) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.licenseType = licenseType;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenseNumber=" + licenseNumber +
                ", licenseType=" + licenseType +
                '}';
    }
}
