package day26_multidimensional_array.homework;

import java.util.Arrays;
import java.util.Scanner;

public class MakeGroup {

/*
We did the group task together, try to make it completely dynamic with Scanner inputs. Ask the number of groups, the number of people in group1, group2, group3, etc... and ask for the name of each person on the group and assign into the array

 */
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Number of group:");
    int numGroup = input.nextInt();
    input.nextLine();

    String [][] groups = new String [numGroup][];


    for (int i = 0; i < groups.length; i++){
        System.out.println("How many person in your group?");
        int personOfGroup = input.nextInt();
        input.nextLine();
        String name = "";

        for (int j = 0; j< personOfGroup; j++){
            System.out.println("Enter first name of the group member " +(j+1));
             name += input.next() +" ";

        }
        groups [i]= name.trim().split(" ");
    }

    System.out.println(Arrays.deepToString(groups));
}
}
