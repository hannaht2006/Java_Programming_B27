package day28_methods.homework;

public class FrequencyOfCharacter {
    /*
    Frequency of Character

create a method that will accept a word(String) and a letter (char) and return how many times that given letter is found in the given word
Ex:
	Input:
		apple, p
	Output:
		2
Ex:
	Input:
		apple, z
	Output:
		0
Ex:
	Input:
		aabbaacca, a
	Output:
		5
     */
    public static void main(String[] args) {
        String str = " aabcaa";
        char letter = 'a';
        System.out.println(frequencyOfCharacter(str, letter));
    }
        public static int frequencyOfCharacter(String str, char letter){

        int count = 0;
        for (int i = 0 ; i < str.length(); i++){
            if (str.charAt(i)==letter){
               count+=1;
            }
        }
       return count;
    }
}
//    public static int frequencyOfChar(String str, char letter){
//
//        int count = 0;
//        for(int i = 0; i < str.length(); i++ ){
//            if(str.charAt(i) == letter){
//                count++;
//            }}
//        return count;
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println(frequencyOfChar("apple", 'p'));
//        System.out.println(frequencyOfChar("apple", 'z'));
//        System.out.println(frequencyOfChar("aabbaacca", 'a'));
//
//    }
//}
