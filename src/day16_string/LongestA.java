package day16_string;

public class LongestA {
    public static void main(String[] args) {
        String word1 ="application";
        String word2 = "mouse";
        String word3 = "java";
        String longest ="";

        int word1Len = word1.length();
        int word2Len = word2.length();
        int word3Len = word3.length();
        if (word1.contains("a")&& word1Len>longest.length()){
            longest = word1;

        }
        if (word2.contains("a") && word2Len>longest.length() ){
            longest = word2;

        }
        if (word3.contains("a") && word3Len>longest.length() ) {
            longest = word3;
        }
        System.out.println(longest + " is the longest with a");
        }




}
