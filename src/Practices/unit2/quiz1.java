package Practices.unit2;
import my_utils.EasyData;

import java.util.ArrayList;
import java.util.Arrays;

public class quiz1 {
    public static void main(String[] args) {
int [] n = {4, 2, 5, 7, 2, 3};
boolean []bl = new boolean [n.length];


for (int i = 0; i< n.length; i++){
    bl[i] =n[i]%2 ==0;

}


        System.out.println(Arrays.toString(bl));


    }
}
