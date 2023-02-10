package day43_abstraction.homework.books;

public class JavaTextbook extends EBook{
    boolean fun;

    public JavaTextbook(boolean fun) {
        this.fun = fun;
    }

    @Override
    public void read() {
        System.out.println("Reading the book");
    }

    @Override
    public void download() {
        System.out.println("Downloading the book");

    }

    @Override
    public void open() {
        System.out.println("Opened the book");

    }
}
