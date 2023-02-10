package day12_switch;

public class Starbucks {
    /*
    drink
    price
    calories
    tall
    2.5
    100
    grande
    4.00
    150
    venti
    4.5
    200

     */
    public static void main(String[] args) {
        String sizeDrink = "grande";
        double price = 0.0;
        int calories = 0;

        switch (sizeDrink) {
            case "tall":
                price = 2.5;
                calories = 100;
                break;
            case "grande":
                price = 4;
                calories = 150;
                break;
            case "venti":
                price = 4.5;
                calories = 200;
                break;

        }
        if (price != 0 && calories != 0) {
            System.out.println("drink size: " + sizeDrink + "\nprice $" + price + "\ncalories " + calories);
        }
    }
}
