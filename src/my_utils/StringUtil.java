package my_utils;

public class StringUtil {
    /*
    This class will be used to create String utility methods
     */
    public static String reverse (String str){
        String reverse ="";
        for (int i = str.length()-1; i >= 0; i--){  // starting from index 1 since we already used index 0 (the first word)
            reverse += str.charAt(i);
        }
        return reverse;
    }
    // palindrome means the String is the same forward and backwards

    public static boolean isPalidrome (String str){

        return reverse(str).equalsIgnoreCase(str);
    }
    /*
    Fix Format

create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase

Ex:
	Input:
		jamES

	Output:
		James
     */
    public static String fixFormat (String str){
        return str.substring(0,1).toUpperCase()+str.substring(1, str.length()).toLowerCase();
    }
    // Camel case
    public static String camelCase (String str){
        String [] allWords = str.trim().split(" ");
        String camelCase = allWords[0].toLowerCase();
        for (int i = 1; i< allWords.length;i++){
            camelCase += fixFormat(allWords[i]);
        }
        return camelCase;
    }
    public static int frequencyOfChar (String str, char letter){
        int count = 0;
        for (int i = 0; i < str.length();i++){
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    public static String getDuplicateCharacters (String str){

        String duplicate = "";
        for (int i = 0;i<str.length() ; i++ ){
            // str.charAt(i) --> give every character

            if (duplicate.contains(""+str.charAt(i))){
                continue;
            }
            int frequency = StringUtil.frequencyOfChar(str, str.charAt(i));

            if (frequency >1) {
                duplicate += str.charAt(i);
            }
        }
        return duplicate;
    }
// check if the number is prime

    public static boolean isPrime (int num){
        int count = 0;
        if (num <2){
            return false;
        }else{
            for (int i = 0; i< num; i++){
                if (i%2==0){
                    count++;
                }
            }
            if (count ==0){
                return true;
            }else{
                return false;
            }
        }
    }

}
