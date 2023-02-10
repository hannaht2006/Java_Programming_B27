package day20_loops;

public class CountCharacters {/*
Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
	Ex:
		Input:
			2juMp41EEkd4s4
		Output:
			3 uppercase letters
			6 lowercase letters
			5 numbers
			*/

    public static void main(String[] args) {
        String s = "2juMp41EEkd4s4";
        int upper=0, lower = 0,num=0;
        for (int i = 0; i< s.length(); i++){
            char letter = s.charAt(i);
            if (letter>='A'&& letter<='Z'){
                upper++;

            }else if (letter>='a' && letter<='z'){
                lower++;
            }else if (letter>='0'&& letter<='9'){
                num++;
            }
        }
        System.out.println("Uppercase: "+upper);
        System.out.println("Lowercase: "+lower);
        System.out.println("Number: "+num);


    }
}
