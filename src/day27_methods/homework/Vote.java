package day27_methods.homework;

public class Vote {
    /*
    person must be 18 and up
     */
    public static void vote (int num){
        if (num>=18 && num<120){
            System.out.println("Eligible to vote");
        }else if (num<18) {
            System.out.println("Not eligible to vote");
        }else if (num >120){
            System.out.println("Not valid age");
        }
    }

    public static void main(String[] args) {
        vote(121);
    }
}
