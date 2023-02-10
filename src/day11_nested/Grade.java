package day11_nested;

public class Grade {
    public static void main(String[] args) {

        int score = 89;

        if (score>=75){
            System.out.println("Passed");

            if (score>92){
                System.out.println("You did really well");
            }else if (score > 80){
                System.out.println("Good job");
            }else {
                System.out.println("not bad");
            }

        }else {
            System.out.println("failed");
            if (score>50){
                System.out.println(" try harder");
            }else {
                System.out.println("study much more");
            }
        }
    }
}
