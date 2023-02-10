package Practices;

public class Hw {
    public static void main(String[] args) {
        String str ="today is saturday";
        String result="";
        String [] str1 = str.toLowerCase().trim().split(" ");
        for (String each : str1){

           result += ""+ each.substring(0,1).toUpperCase()+ each.substring(1, each.length());
        }
        result = result.substring(0,1).toLowerCase()+result.substring(1,result.length());
        System.out.println(result);
}}
