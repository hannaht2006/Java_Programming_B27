package day43_abstraction.homework.shop;

final class Amazon extends OnlineShopping{

    @Override
    public void viewCart() {
        System.out.println("Your cart have 2 items");

    }

    @Override
    public boolean payForShipping(double totalCost) {

        return totalCost<25? true:false;
    }

    @Override
    public void buyItem() {
        System.out.println("Success buying your items");
    }

    @Override
    public void returnItem() {
        System.out.println("Success returning your items");

    }
}
