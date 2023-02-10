package day39_inheritance.library;

public class AudioBook extends Book{
    String narrator;
    double duration;

}

// audioBook is a Book

//how many instance variable does AudioBook object has access to?
//> it has 6 from the super class
//>2 plus 2 from its class, so total of 8