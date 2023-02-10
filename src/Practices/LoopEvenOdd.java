package Practices;

public class LoopEvenOdd {
    public static void main(String[] args) {
        int i =1;
        String s1 = "";
        String s2 = "";
        while(i<=20){
            if (i%2==0){
                s1+= i +" ";
            }
            else if (i%2==1){
                s2+= i+" ";


            }
            i++;

        }
        System.out.print(s1);
        System.out.println();
        System.out.print(s2);
        int j = 1;
        String s3 = "";
        String s4 = "";

        while (j<50){
           if(j%2 ==0) {
              s3 += j +",";
           }
           else if(j%2==1){
               s4 += j +",";
            }
           j++;
        }
        System.out.println(s3);
    }
}
