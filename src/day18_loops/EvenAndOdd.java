package day18_loops;

public class EvenAndOdd {
    public static void main(String[] args) {

        int limit = 100;
        int count = 1;

        //printing all the even numbers

        while (count<=limit){// run for limit number of times. Go from 1 to limit
            if (count %2==0){
                System.out.print(count+ " ");

            }
            count++;//increment of the loop --> put in the loop, not in the if statement.
        }
        System.out.println("------");

        //print all the odd number frm limit to 1, backward

        int back =limit;// starting number based on the limit variable
        while(1<=back && back <= limit) {

            if (back%2==1){
                System.out.print(back +" ");
            }
            back--;
        }

    }
}
