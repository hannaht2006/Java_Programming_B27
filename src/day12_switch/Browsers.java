package day12_switch;

public class Browsers {
    public static void main(String[] args) {

        String browser = "chrome";
        switch (browser){
            case "chrome":
            case "Chrome":
            case "CHROME":
                System.out.println("opening google and chrome");
                break;
            case "firefox":
                System.out.println("opening google and firefox");
                break;
            case "safari":
                System.out.println("Special setup or apple computer");
                System.out.println("opening in safari");
                break;
            default:
                System.out.println("opening chrome by default");
        }
    }
}
