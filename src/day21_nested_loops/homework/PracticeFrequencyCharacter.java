package day21_nested_loops.homework;

public class PracticeFrequencyCharacter {
    /*
    given a string determine how many times character is in the String java
     */
    public static void main(String[] args) {
        String str = "java";
        String result = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            if (!result.contains(""+str.charAt(i))) {

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(str.charAt(i) + " " + count);
                result += str.charAt(i);
            }
            }



    }
}
