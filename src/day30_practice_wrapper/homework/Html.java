package day30_practice_wrapper.homework;

public class Html {
    /*
    HTML Generator

Given a String in the following format take the number part of the generator the html tags.
    Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^

    Ex:
        Input:
            div^2
        Output:
            <div></div> <div></div>

    Ex:
        Input:
            li^3
        Output:
            <li></li><li></li><li></li>

     */
    public static void main(String[] args) {
        String s = "li^3";
        String letter ="", num ="", special ="";
        String result ="";

        for (int i = 0; i < s.length();i++){
            char l = s.charAt(i);
            if (Character.isDigit(l)){
                num += l;
            }else if (Character.isLetter(l)){
                letter += l;
            }
        }
        int n = Integer.parseInt(num);
        String str1 = '<'+letter+'>'+'<'+'/'+letter+'>';
        for (int j = 0; j<n ; j++){
            result += ""+str1;
        }
        System.out.println(result);
    }
}
