package day21_nested_loops;

import java.util.Scanner;

public class PrimeInRange {
    /*
    Prime: number is only divisible by 1 and itself
    print all the prime number up to certain number
    ex: print all prime number from 2 -50
     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("What number do you want to go to?");
        int range = input.nextInt();
        // outer loop : checks all number from 2 to range
        for (int i = 2; i < range; i++){ //starting from 2 and going until the range number

            boolean isPrime = true;
            // inner loop: check if the number is prime
            for (int j =2; j < i; j++ ){// starting from 2 because I want to check divisibility of the number from 2 to the number itself
                if (i%j == 0){ // the number we are checking (i) is evenly divisible by the j value (from 2 to the number) it means its not prime
                    isPrime = false;
                    break; // break stop the inner loop right when i%j ==0 at first check; sooner than without break(can be removed)
                }

            } // end of the inner loop
           if (isPrime) {
               System.out.println(i);
           }
        } // end of outer loop





    }
}
