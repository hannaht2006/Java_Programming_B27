package day29_methods;

public class FrequencyOfCharacter {
    /*
    create a method that will accept a word(String) and a letter (char) and return how many times that given letter is found in the given word
    "java"
    a
    2
     */
    public static int frequencyOfChar (String str, char letter){
        int count = 0;
        for (int i = 0; i < str.length();i++){
           if (str.charAt(i) == letter) {
               count++;
           }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChar("java", 'a'));
        System.out.println(frequencyOfChar("apple", 'a'));
    }
}
