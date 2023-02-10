package day20_loops;

import java.util.Scanner;

public class CamelCase {
    /*
    Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

Ex:

	Today is SUNDAY

	Output:

	todayIsSunday
     */
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        String str = imput.nextLine().toLowerCase();
        String camelCase ="";

        for (int i =0; i<str .length(); i++){
            if (str.charAt(i)==' '){
                camelCase += str.substring(i+1,i+2).toUpperCase();
                //(""+str.charAt(i+1)).toUpperCase();
                i++; // we need to change the i because we already used the start of the first word and don't want to repeat it
            }else{
                camelCase += str.charAt(i);
            }
        }
        System.out.println(camelCase);

    }
}
