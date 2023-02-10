package day21_nested_loops.homework;

public class FirstIndexUniqueChar {
    /*
     Write a program that can return the index number of the first unique character.
     */
    public static void main(String[] args) {
        String str = " aaccbdd";
        int index = 0;
        int count = 0;
       outer: for (int i = 0; i< str.length(); i++){
            count = 0;
            for (int j = 0; j < str.length(); j++){
                if (str.charAt(i)== str.charAt(j)){
                    count++;
                    }


                }
           if (count ==1){
               System.out.println(str.charAt(i) + " "+ i);
               //break outer;
            }
        }
    }
}
