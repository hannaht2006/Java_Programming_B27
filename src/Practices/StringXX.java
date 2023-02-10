package Practices;

public class StringXX {
    public static void main(String[] args) {

        String str = "abcxxx";

        System.out.println(countXX(str));
    }
    static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx")) count++;
        }
        return count;
    }
}
