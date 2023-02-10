package day44_polimorphism.hw.socialmedia;

public abstract class SocialMedia {

    static String platform;

    private String personalURL;
    private int accountLength;
    private String userName;
    private String password;
    private String fullName;

    public String getPersonalURL() {
        return personalURL;
    }

    public void setPersonalURL(String personalURL) {
        this.personalURL = personalURL;
    }

    public int getAccountLength() {
        return accountLength;
    }

    public void setAccountLength(int accountLength) {
        this.accountLength = accountLength;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public abstract void directMessage(String userName, String message);
    public abstract void post(Object media);
    public abstract void notification();
}
