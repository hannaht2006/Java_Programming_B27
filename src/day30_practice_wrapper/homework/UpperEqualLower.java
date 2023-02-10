package day30_practice_wrapper.homework;

public class UpperEqualLower {
    /*

Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string

Ex:
    str = "JAVA java";

output:

    true
     */
    public static void main(String[] args) {
        String str = "JAVA java";
        String upper = "", lower = "";
        for (int i = 0; i< str.length(); i++){
            char letter = str.charAt(i);

            if (Character.isUpperCase(letter)){
                upper += letter;
            }else if (Character.isLowerCase(letter)){
                lower += letter;
            }
        }
        boolean upperEqualLower = false;
        if (upper.length() == lower.length()){
            upperEqualLower = true;
        }
        System.out.println(upperEqualLower);
    }
}
