package day43_abstraction.homework.shop;

final class Ebay extends OnlineShopping implements AllowUsersToSell{

    @Override
    public void uploadProduct() {
        System.out.println("Product is uploaded");

    }

    @Override
    public void viewCart() {
        System.out.println("your items are in the cart");

    }

    @Override
    public boolean payForShipping(double totalCost) {
        return totalCost<20?true:false;
    }

    @Override
    public void buyItem() {
        System.out.println("Buy your items in the cart");

    }

    @Override
    public void returnItem() {
        System.out.println("Returned your items");

    }
}
