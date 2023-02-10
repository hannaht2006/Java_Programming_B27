package day44_polimorphism.hw.socialmedia;

import java.util.ArrayList;

public class Facebook extends SocialMedia {
    int age;
    int numberOfFriend;
    ArrayList<Post> posts;

    //static block set platform:
    static {
        SocialMedia.platform = "Facebook";
    }

    public Facebook(String userName, String password) {
        this.setUserName(userName);
        if (password.contains(userName)) {
            System.out.println("Password contained username. Default password created:'password' ");
           this.setPassword("password");
        } else {
            this.setPassword(password);
        }

        setPersonalURL("facebook.com/" + userName);
        posts = new ArrayList<>();
    }

    public Facebook(String userName, String password, String fullName) {
        this(userName, password);
        for (char c : fullName.toCharArray()) {
            if (Character.isDigit(c)) {
                System.out.println("invalid name");
                this.setFullName("no name");
                break;
            }
        }
        if (!this.getFullName().equals("no name")) {
            this.setFullName(fullName);
        }
    }

    public Facebook(String userName, String password, String fullName, int age, int numberOfFriend) {
        this(userName, password, fullName);
        if (age <= 0 && age >= 120) {
            System.out.println("invalid age");
            this.age = 0;
        } else {
            this.age = age;
        }
        if (numberOfFriend <= 0 && numberOfFriend > 5000) {
            System.out.println("invalid number of friends");
            this.numberOfFriend = 0;
        } else {
            this.numberOfFriend = numberOfFriend;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfFriend() {
        return numberOfFriend;
    }

    public void setNumberOfFriend(int numberOfFriend) {
        this.numberOfFriend = numberOfFriend;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }


    @Override
    public void directMessage(String userName, String message) {
        System.out.println(message + " sent to " + userName);

    }

    @Override
    public void post(Object media) {
       Post post = new Post("Hello");
       this.posts.add(post);
    }

    @Override
    public void notification() {

    }
}
