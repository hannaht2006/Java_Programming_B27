package day21_nested_loops;

public class NestedStop {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {

            if (i%2==0) break;// i even : stop the loop when i is even number
            // if (i%2 ==1) break; i odd: stop the loop when i is odd number

            for (int j = 0; j < 3; j++) {

                System.out.println(i + "  " + j);
            }

            //break; // put here for outer loop: only run i =0 and stop the loop
        }
        System.out.println("----------------");

      //  outer: for (int i = 0; i < 4; i++) {

       //    inner:  for (int j = 0; j < 3; j++) {
         //   if (i == 3) break outer;
        //       System.out.println(i + "  " + j);
          //  }
       // }
    }
}
