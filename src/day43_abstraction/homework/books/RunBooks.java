package day43_abstraction.homework.books;

public class RunBooks {
    public static void main(String[] args) {
        JavaTextbook book1 = new JavaTextbook(true);
        book1.download();
        book1.open();
        book1.read();
        System.out.println("Java is fun: "+ book1.fun);


    }
}
