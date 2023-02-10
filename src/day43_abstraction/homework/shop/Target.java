package day43_abstraction.homework.shop;

final class Target extends Shopping {
    @Override
    public void buyItem() {
        System.out.println("Buy one item");
    }

    @Override
    public void returnItem() {
        System.out.println("Return one item");

    }
}
