package day09_if_statements;

public class LunchTime {
    public static void main(String[] args) {

        boolean hungry = true;
        boolean isLunchTime = true;

        if (isLunchTime && hungry){
            System.out.println("go eat lunch");
            System.out.println("Take a break");
        }else {
            System.out.println("Practice more java");
        }
    }
}
