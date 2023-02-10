package my_utils;

import java.util.Arrays;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 7, 5, 3};
        System.out.println(indexOf(nums, 5));

        String []str = { "hello", "world", "java", "apple"};
        String el = "Apple";
        System.out.println(indexOf(str,el));
        System.out.println(Arrays.toString(addElement(str, el)));

        String []str1 = { "hello", "world", "java", "apple"};
        String [] el1 = {"orange","Apple","pear"};
        System.out.println(Arrays.toString(addElement(str1, el1)));



    }

    /*
create a method that will accept an int array and return the smallest number from the array
     */
    public static int min(int... arr) { // int[] arr is the same int ... arr

        int min = arr[0];
        for (int each : arr){
            if (min > each){
                min = each;
            }
        }
        return min;
    }
/*
Max Number

create a method that will accept an int array and return the biggest number from the array
 */
    public static int max(int... arr) {

        int max = arr[0];
        for (int each : arr){
            if (max < each){
                max = each;
            }
        }
        return max;
    }
    /*
create a method that will accept an int array and an int number. Check and return if the given number is in the array.
     */

    public static boolean contains(int num, int ... arr ) {// we can write contains(int [] arr, int num)
        for (int each : arr) {
            if (each == num) {
                return true;
            }
        }
        return false;
    }
        /*
        int count = 0;
        boolean result = false;
        for (int each : arr) {
            if (each == num) {
                count++;
            }
            if (count != 0) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
        }
 */



    /*
    IndexOf

create a method that will accept an int array and an int number. Find and return the index of the number in the array. If there is multiple occurrence return the first occurrence's index

     */

    public static int indexOf(int[] arr, int num) {//if you want to use var args :public static int indexOf(int num, int ... arr)

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1; // if (arr[i] != num) so will return -1 by default
    }

    public static int indexOf (int []arr, int target, int startIndex){
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] == target) { //every number from the array with the number we are looking for
                return i;
            }
        }
        return -1;
    }

    /*

IndexOf

overload the indexOf method to work with String array and String element
     */
    public static int indexOf(String[] words, String element) {
        int index = 0;
        for (int i = 0; i <= words.length; i++) {
            if (words[i].equalsIgnoreCase(element.trim())) {
                index = i;
                break;
            }
        }
        return index;
    }
    /*
    Add Element

create a method that will accept a String array and a String element. Add the given element value into the end of the array. Do not replace the last index of the given array, but instead create a new array with a bigger size to fit all the original elements plus the new one

     */
    public static String [] addElement(String [] arr , String element) {

        String[] newArr = new String[arr.length + 1]; // create an array with an extra size

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = element;
        return newArr;
    }

    /*
    public static String [] addElement(String []words , String element){
        String [] addElements = Arrays.copyOf(words, words.length+1);
        addElements [words.length] = element;
        //   System.out.println(Arrays.toString (addNums));
        return addElements;
    }

     */
    /*
    Add Element

overload the add element method to accept two String arrays. For this one add all the given elements from the second array in the the first array.

Ex:
	{"today", "is", "monday"}
	{"no", "softskills", "today"}

output > [today, is, monday, no, softskills, today]

     */
    public static String [] addElement(String []original , String [] other){


        String [] merged = new String[original.length + other.length];

        for (int i = 0; i < original.length ; i++){ //copy the elemets from the original array to the merged array
            merged [i] = original[i];
        }

        for (int i = 0; i < other.length; i++){ //read the elements from the other array and store them into the merged array
            merged [original.length + i] = other [i];
        }
        //[today, is, monday, no, softskills, today]
        return merged;
    }

}
