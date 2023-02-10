package day20_loops;

public class ReverseMiddle {
    /*
    Given a String with three words separated by spaces. Reverse only the second word and return the modified String
	Ex:
	I love java

	Ouput:
	I evol java
     */
    public static void main(String[] args) {
        String s = "I love java";
        int start = s.indexOf(' ')+1; //give us the first index of the character of the middle word
        int end = s.lastIndexOf(' ');
        String middleWord = s.substring(start, end);
        String reverse = "";
        for (int i = middleWord.length() - 1; i >= 0; i--) { //loop starts from the last index of the middle word and goes until the first index in a backward order
           reverse +=middleWord.charAt(i);
        }
        System.out.println(s.substring(0,start-1)+" "+reverse+ " "+ s.substring(end+1));

    }
}
/*

take a look at, alternative to reverse middle

      String str = "I love java";
      String reverse = "";

      for(int i = str.lastIndexOf(' ') - 1; i > str.indexOf(' '); i--){
        reverse += str.charAt(i);
      }

 */