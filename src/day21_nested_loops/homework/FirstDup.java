package day21_nested_loops.homework;

public class FirstDup {
    /*
     Write a program that can return the first duplicated character from a string
     */
    public static void main(String[] args) {
        String str = " abcdd";
        int count = 0;
        String firstDup = "";

       outer: for (int i = 0; i < str.length(); i++){
            count = 0;

            inner: for (int j = 0; j < str.length(); j++){

                if (str.charAt(i) == str.charAt(j)){
                    count++;

                if (count == 2)   {
                    System.out.println(""+ str.charAt(i));
                    break outer ;
                }
                }
            }
        }
    }
}
