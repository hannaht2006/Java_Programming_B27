package day22_arrays.homework;

public class Name {
    /*
    Create a String array that has full names. Go through manually and print the initials of each name. Get each name(element) and use the String methods needed

    Ex: ["James Bonds", "Harry Potter", "Tony Stark"]

        JB
        HP
        TS

No loop yet
     */
    public static void main(String[] args) {
        String [] fullName = {"James Bonds", "Harry Potter", "Tony Stark"};
        System.out.print(fullName[0].charAt(0) );
        System.out.print(fullName[0].charAt(fullName[0].lastIndexOf(' ')+1));
        System.out.println();

        System.out.print(fullName[1].charAt(0) );
        System.out.print(fullName[1].charAt(fullName[1].lastIndexOf(' ')+1));
        System.out.println();

        System.out.print(fullName[2].charAt(0) );
        System.out.print(fullName[2].charAt(fullName[2].lastIndexOf(' ')+1));

    }
}
