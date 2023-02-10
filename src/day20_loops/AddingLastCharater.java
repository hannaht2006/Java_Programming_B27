package day20_loops;

public class AddingLastCharater {
    public static void main(String[] args) {
        String str = "hello";
        int end = 3;

        for (int i=0; i< end; i++){ //int i=1; i<=end
           str+= str.charAt(str.length()-1);// the character at the last index

        }
        System.out.println(str);
    }
}
