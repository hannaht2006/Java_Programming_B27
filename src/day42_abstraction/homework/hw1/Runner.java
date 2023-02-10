package day42_abstraction.homework.hw1;

public class Runner {
    public static void main(String[] args) {
        System.out.println(Library.getLibraryCard("Fairfax"));
        try {
            System.out.println(Library.borrow(false));
        } catch (FailToCheckOutException e) {
            System.out.println(e.getMessage());
        }
    }
}
