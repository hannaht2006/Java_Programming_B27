package Practices;

public class String2xx {
    /*

Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
     */

    public static void main(String[] args) {
        String str = "xaxxx";

        boolean result = false;
        for(int i =0; i < str.length()-1; i++){
            if(str.charAt(i)=='x' && str.charAt(i+1)=='x'){
                result = true;
            }
        }
        System.out.println(result);
    }
}
