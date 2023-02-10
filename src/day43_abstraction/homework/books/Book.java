package day43_abstraction.homework.books;

public abstract class Book {

    String name;
    public abstract void read();
}
/*
Create an abstract class Book
    - Declare a name variable
    - Declare an abstract methods:
        read();

Create an interface Downloadable
    - Declare an abstract methods:
        download();

Create an abstract class EBook
    - Inherits Book and implements Downloadable
    - Declare a size variable
    - Declare an abstract methods:
        open()

Create a concrete class JavaTextbook
    - Inherits EBook
    - Declare a fun variable
    - Override all abstract methods
 */
