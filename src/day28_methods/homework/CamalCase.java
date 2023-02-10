package day28_methods.homework;

public class CamalCase {
    public static void main(String[] args) {
        String str = "today is saturday";
        System.out.println(camelCase(str));
    }

    public static String camelCase(String str) {

        String [] str1 = str.toLowerCase().trim().split(" ");
        String result ="";
        for (String each : str1){

            result += ""+ each.substring(0,1).toUpperCase()+ each.substring(1, each.length());
        }
        result = result.substring(0,1).toLowerCase()+result.substring(1,result.length());
        return result;
    }
}
