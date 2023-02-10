package day43_abstraction.homework.books;

public abstract class EBook extends Book implements Downloadable {
    double size;
    public abstract void open();
}
