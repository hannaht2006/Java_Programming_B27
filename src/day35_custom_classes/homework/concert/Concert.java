package day35_custom_classes.homework.concert;

public class Concert {
    public static void main(String[] args) {

        Song songOne = new Song("Melody", 10, "Jane", "Romantic");

        Song songTwo = new Song("Love Story" ,15,"Sam", "Romantic");
        System.out.println(songOne);
        System.out.println(songTwo);
    }
}
