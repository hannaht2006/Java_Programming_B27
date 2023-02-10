package day37_static.bestbuy;

public class BestBuyStores {

    public static void main(String[] args) {

      //  BestBuy.location = "Fairfax";// location is an instance variable, so we need an object in order to access
        BestBuy store1 = new BestBuy();
        store1.location  = "Fairfax";
        System.out.println(store1.location);

        System.out.println(BestBuy.headQuarter);//this is a static variable, which means we can use the class name to access

        System.out.println(store1.headQuarter);//this is valid syntax, but you should use the class name to access, but instance references

        //other static members

        System.out.println(Math.PI);//PI is static
        System.out.println((Integer.MIN_VALUE));// min value in static

       // Arrays.sort();// accessing by class name -> static method from Arrays class
    }
}
