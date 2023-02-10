package day40_inheritance.app;

public class Phone {
    public static void main(String[] args) {
        Youtube youtube = new Youtube(4.8);
        System.out.println(youtube.name);
        System.out.println(youtube.version);
        youtube.download();
        youtube.watchVideo();
        System.out.println(youtube);//since we haven"t create toString for printing ->day40_inheritance.app.Youtube@783e6358
    }
}
//youtube iss an App
//App is an object
//Youtube is an object