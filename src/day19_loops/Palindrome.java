package day19_loops;

public class Palindrome {
    /*
    given a String determine if it is palindrome
    palindrome means the String is read the same forwards and backwards
    ex:
    anna
    racecar
    maam

     */
    public static void main(String[] args) {
        String s = "racecar";
        String reverse ="";
        // reverse my String, read it back from last index to first, backwards

        for (int i = s.length()-1; i>= 0; i--){ // i is just a number, but using length - 1 allow me to find the last index of the String, that means we can use that index to read characters
           reverse += s.charAt(i);

        }
        System.out.println(reverse);

        if (s.equalsIgnoreCase(reverse)){
            System.out.println("palindrome");
        }else{
            System.out.println(" word is not palindrome");
        }
        System.out.println(s.equals(reverse) ? "Palindrome" : "Not Palindrome");
    }
}
