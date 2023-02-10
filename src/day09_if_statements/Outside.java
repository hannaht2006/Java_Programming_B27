package day09_if_statements;

public class Outside {
    public static void main(String[] args) {
        double degree = 80;
        if(degree >= 72){
            System.out.println("It's nice, go outside");
        }
        if(degree <72){
            System.out.println("stay inside, code some java");
        }

        // as if   else

        if(degree >= 72){
            System.out.println("It's nice, go outside");

        } else {
            System.out.println("stay inside, code some java");
        }
    }
}
