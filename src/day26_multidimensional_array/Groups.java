package day26_multidimensional_array;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
        String [][] cydeo = {
                {"Alen", "Tina", "Alena", "Nargiza"},
                {"Anam", "Baz", "Busra", "Ostap"},
                {"Rabia", "Shahad"},
                {"Ketino", "Eylul", "Nadia"}
        };
        System.out.println(Arrays.deepToString(cydeo));
        System.out.println(cydeo.length); //--> 4: how many inner 1D array is there
        System.out.println(cydeo[2].length);//-->2: how many elements in the array at index 2
        System.out.println(cydeo[0][3]);//--> Nargiza: accessing one specific String element from the inner array at index o and giving back the element at index 3
        System.out.println(Arrays.toString(cydeo[1]));// printing the whole inner array at index 1
        
        // how to loop through each name in all groups
        System.out.println("_  loop through each name in all groups_");
        for (String [] eachInner : cydeo) { // to loop through the 2D array,
            System.out.println(Arrays.toString(eachInner));
        }
        System.out.println("_  loop for each name_");
        //how to loop for each name
        for (String []eachInner : cydeo){
            for (String eachName : eachInner){
                System.out.println(eachName);
            }
        }
        System.out.println("_  loop through each name and print the last letter in uppercase_");

        //how to loop through each name and print the first letter in uppercase
        for (String []eachInner : cydeo){
            for (String eachName : eachInner){
                System.out.println(eachName.substring(eachName.length()-1).toUpperCase());
            }
        }
    }
}
