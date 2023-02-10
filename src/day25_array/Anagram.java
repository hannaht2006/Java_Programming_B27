package day25_array;

import day14_String.homework.Password;

import java.util.Arrays;

public class Anagram {
    /*
    [IQ] Given two Strings determine if they are anagram or not. Anagram is when the character of the words can be reordered to get a different word
Ex:
  listen
  silent

The letters of the two words are the same so they are anagram
     */
    public static void main(String[] args) {
        String word1 = "Listen".toLowerCase();
        String word2 = "silent".toLowerCase();

        char [] first = word1.toCharArray();
        char [] seconds = word2.toCharArray();
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(seconds));

        Arrays.sort(first);
        Arrays.sort(seconds);

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(seconds));

        if (Arrays.equals(first,seconds)){
            System.out.println("they are anagram");

        }else{
            System.out.println("they are not anagram");
        }
        System.out.println(Arrays.equals(first,seconds)? "they are anagram": "not anagram");

        System.out.println("----------------------");

        String word = "hAnnah@1972";
        int min = 6;
        int max = 16;
        int digit = 0;
        int lower = 0;
        int upper = 0;
        int special = 0;



        if(word.length()>=6 && word.length()<=16 &&!word.contains(" ")){

           for (int i = 0; i<word.length(); i++){
               char c = word.charAt(i);
               if(Character.isDigit(c)){
                   digit++;
               }
               if(Character.isLowerCase(c)){
                   lower++;
               }
               if(Character.isUpperCase(c)){
                   upper++;
               }
               if(c>=33&&c<=46||c==64){
                   special++;
               }

            }
           if(special>=1&&lower>=1&&upper>=1&&digit>=1){
               System.out.println("password is good");
           }

        }else{
            System.out.println("password is not qualify");
        }



    }
}
