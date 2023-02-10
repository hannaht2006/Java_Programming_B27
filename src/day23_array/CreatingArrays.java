package day23_array;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingArrays {
    public static void main(String[] args) {
        /*
        person information
        0 --> id
        1 --> first name
        2 --> last name
        3 --> batch num
         */

        //have all information
        String [] studentOne = {"04", "Kristina", "Gaidamoviv", "27"};
        System.out.println(Arrays.toString(studentOne));

        // know the number of elements, but not the value yet
        String [] studentTwo = new String[4];
        studentTwo [0] = "10";
        studentTwo [1] = "Olena";
        studentTwo [2] = "Kravetska";
        studentTwo [3] = "27";
        System.out.println(Arrays.toString(studentTwo));

        //know the number of elements, and add from Scanner
        Scanner input = new Scanner(System.in);
        String [] studentThree = new String [4];
        System.out.println("enter your id:");
        studentThree [0]= input.next();
        System.out.println("enter your first name:");
        studentThree [1]= input.next();
        System.out.println("enter your last name:");
        studentThree [2]= input.next();
        System.out.println("enter your batch number:");
        studentThree [3]= input.next();

        System.out.println(Arrays.toString(studentThree));

        // most dynamic:
        String [] studentFour = new String [4];
        String [] question = {"id", "first name", "last name", "batch number"};
        for (int i = 0; i< studentFour.length; i++){
            System.out.println("enter your "+question[i]); //printing dynamic message based on the questions defined in the question elements
            studentFour[i] = input.next(); //storing the scanner input from the console into the array at index i
        }
        System.out.println(Arrays.toString(studentFour));
int[] nums = new int[2];

    }
}

