package day21_nested_loops;

public class BiggestSubString {
    /*
    Biggest substring of matching characters

Given a String find the biggest substring of chars that match and print it.
    Ex:
        Input:
            aaabbbcccccddddee
        Output:
            ccccc
     */
    public static void main(String[] args) {
        String str = "aaabbbcccccddddeeeeeee";
        String longgest = "";
        String each = "";
        for (int i = 0; i < str.length() - 1; i++) {
            each += str.charAt(i); // add the  characters at index to the string each

            // check for the end of the string:
            if (i==str.length()-2 && str.charAt(i)==str.charAt(i+1)){ // i==str.length == 2 is the last index this loop checks
                each += str.charAt(i+1);
                if ( each.length() > longgest.length()) {
                    longgest = each;// if you find a longer substring, then assign it to the longest variable
                }
            }

            if (str.charAt(i) != str.charAt(i + 1)) {//if the current character is not equal to the next character
                if ( each.length() > longgest.length()) {
                    longgest = each;// if you find a longer substring, then assign it to the longest variable
                }
                each =""; // resetting string each back to empty for the next part.
            }

        }
        System.out.println(longgest);
    }
}
