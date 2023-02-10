package day20_loops;

public class PrimeNumber {
    public static void main(String[] args) {
        int n =9;
        boolean isPrime = true;

        if (n<2){
            System.out.println("Not Prime");
            System.exit(0); // stop the code
        }
        for (int i = 2; i<n; i++){
            if (n%i==0){  // even number, not prime---> isPrime -> false
                isPrime = false;

            }
        }
        System.out.println(isPrime? " Prime": "Not Prime");
    }
}
