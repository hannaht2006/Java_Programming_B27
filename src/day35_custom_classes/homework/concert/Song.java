package day35_custom_classes.homework.concert;

public class Song {
    /*
      create a class called Song

        - data:

            name, length, artist, genre

        - constructor

            - create a constructor that creates an Song object with the name, length, artist, and genre

        - method:

            toString()
                print all the Song information

    Create a separate class to create and test the Song objects
     */
    String name;
    int length;
    String artis;
    String genre;

    public Song(String name, int length, String artis, String genre){
        this.name =name;
        this.length = length;
        this.artis = artis;
        this.genre = genre;
    }


    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", artis='" + artis + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
