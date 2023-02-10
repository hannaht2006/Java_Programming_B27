package day38_encapsulation.homework.amazon;

public class UserAmazon {
    public static void main(String[] args) {

        AmazonAccount userAccount1 = new AmazonAccount( "Hannah", "hannah@gmail.com",true);
        System.out.println(userAccount1);


        System.out.println(userAccount1.getUserName());
        System.out.println(userAccount1.getEmail());

        AmazonAccount userAccount2 = new AmazonAccount("Cat", "cat2006@yahoo.com", false);
        System.out.println(userAccount2);
        System.out.println(userAccount2.getUserName());
        System.out.println(userAccount2.getEmail());

    }
}
