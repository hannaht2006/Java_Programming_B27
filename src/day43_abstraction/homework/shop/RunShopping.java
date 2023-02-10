package day43_abstraction.homework.shop;

public class RunShopping {
    public static void main(String[] args) {
        Target one = new Target();
        one.buyItem();
        one.returnItem();

        Amazon two = new Amazon();
        two.viewCart();
        two.payForShipping(20.99);
        two.buyItem();
        two.returnItem();

        Ebay three = new Ebay();
        three.uploadProduct();
    }
}