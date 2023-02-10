package day20_loops;

public class CountHi {
    public static void main(String[] args) {
        // counting how many hi is in the string
        String s = "abcdhhiiellhiofrhiiday";

        // approach 1: while loop and delete the first occurrence each time
        int count =0;
        while (s.contains("hi")){
            System.out.println(s);
            count++;
            s = s.replaceFirst("hi", "");//don't use replace(), because will delete all hi at 1 time

        }
        System.out.println(count);

        //approach 2: for loop to check one index at a time, but when there is an h we will check another index

        String s2= "abcdhhiiellhiofrhiiday";
                 // 0123456789.....
              //ab :01 ---> sub(0,2)
              //bc :12 ---> sub(1,3)
              //cd : 23 ---> sub(2,4)

        int count2 =0;
        for (int i=0; i<s2.length()-1; i++){
            if (s2.charAt(i)=='h'&& s2.charAt(i+1)=='i'){ //i+1 checks next char
                count2++;

            }
        }
        System.out.println(count2);

        //approach 3: using indexes to check every 2 characters

        String s3= "abcdhhiiellhiofrhiiday";
        int count3 =0;
        for (int i=0; i<s3.length()-1; i++){

            if (s3.substring(i,i+2).equals("hi")){
                count3++;

            }
        }
        System.out.println(count3);
    }
}
