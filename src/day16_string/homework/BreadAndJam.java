package day16_string.homework;

import java.util.Scanner;

public class BreadAndJam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        str = str.toLowerCase();

        if (str.contains("bread")&& str.length()>10){

            int fIndex = str.indexOf("bread");
            String newStr1 = str.substring(fIndex);

            String newStr2 = newStr1.substring(5);

            if(newStr2.contains("bread")&& newStr2.length()>5&& !newStr2.startsWith("bread")){

                int sIndex = newStr2.indexOf("bread");
                String newStr3 = newStr2.substring(0,sIndex);
                System.out.println(newStr3);


            }else if(newStr2.contains("bread")&& newStr2.length()>5&& newStr2.startsWith("bread")){

                String nStr4 = newStr2.substring(5);
                String b = newStr2.substring(0, 5);

                int tIndex = nStr4.indexOf("bread");
                String nStr5= nStr4.substring(0,tIndex);

                System.out.println(""+b+nStr5);

            }
            else{
                System.out.println("nothing" );
            }

        }else{
            System.out.println("nothing" );
        }

    }

}
