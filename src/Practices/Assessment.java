package Practices;

import java.util.Arrays;

public class Assessment {
    public static void main(String[] args) {
       int []num1 = {1, 2, 3, 4};
       int []num2 = num1;
       num1[0]=10;
       num2[2]= 9;
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));

        char []letter = {'A', 'Z', 'y', 'b'};
        Arrays.sort(letter);
        for (char each : letter){
            if (each < 'a'){
                continue;
            }
            System.out.println(each);
        }
        System.out.println("---------------");
        System.out.println(Arrays.toString(letter));
    }

}

