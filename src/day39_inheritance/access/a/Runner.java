package day39_inheritance.access.a;

public class Runner {
    public static void main(String[] args) {

        //Q: what did I inherit, what did i have access to?
        Condo condo = new Condo();
        condo.address = "123 l";
        condo.city = "Chicago";
        condo.state = "IL";//is inherited because we are in the same package
        //condo.zipcode = zipcode was private it doesn't inherit
    }
}
