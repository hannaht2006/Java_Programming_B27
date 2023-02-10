package day38_encapsulation.homework.amazon;

public class AmazonAccount {
    /*
    Create a class AmazonAccount

    instance variables:
        - userName (String)
        - email (String)
        - hasPrime (boolean)

    constructor:
        - initialize the fields

    encapsulate AmazonAccount

    methods: toString()

Create a class UseAmazon

    create an object of the AmazonAccount and verify the constructor, getters and setters and toString are working properly
     */
    private String userName;
    private String email;
    boolean hasPrime;

    public AmazonAccount(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public AmazonAccount(String userName, String email, boolean hasPrime) {
        this(userName, email);
        this.hasPrime = hasPrime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isHasPrime() {
        return hasPrime;
    }

    public void setHasPrime(boolean hasPrime) {
        this.hasPrime = hasPrime;
    }

    @Override
    public String toString() {
        return "AmazonAccount{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", hasPrime=" + hasPrime +
                '}';
    }
}
