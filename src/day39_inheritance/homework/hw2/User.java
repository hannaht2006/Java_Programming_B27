package day39_inheritance.homework.hw2;

public class User {
    public static void main(String[] args) {
        Instagram user1 = new Instagram(2.5);
        user1.download();
        System.out.println(user1);
        user1.postPicture();

        Youtube user2 = new Youtube(5.7);
        user2.download();
        System.out.println(user2);
        user2.watchVideo();


    }



}
