package day28_methods.homework;

public class Palidrome {
    /*
    create a method  that will accept a String and find if it is Palindrome or not (boolean)
     */

    public static void main(String[] args) {
        System.out.println(isPalindrome("anna"));
        System.out.println(isPalindrome("cat"));
    }
    public static boolean isPalindrome (String str){

        String reverse = "";
        for (int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }

        if (str.equalsIgnoreCase(reverse)){
            return true;

        } else {
            return false;
        }

    }
}
