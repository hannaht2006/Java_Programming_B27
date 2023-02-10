package Practices;

public class BinaryNumber {
    public static void main(String[] args) {
        int n = 7;

        int[] store = new int [32];
        int i = 0;
        while(n>0){
            store[i] = n%2;
            n = n/2;
            i++;

        }
        for (int j = i-1; j>=0; j--){
            System.out.println(store[j]);
        }
    }

}
