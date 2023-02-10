package day17_strings;

public class MiddleChar {

    public static void main(String[] args) {
        String str ="water";
        //           01234  --> length ==5; length()/2 = 2, and remain 1

        // elevators ; length =9 , length/2= 9/2=4
        // 012345678

        if (str.length()%2 ==1) {
    // string has an odd number of characters, so 1 is middle char
          int midIndex = str.length()/2;

            System.out.println("the middle character: "+ str.charAt(midIndex));

        }else{
    // str has an even number of characters, so 2 middle char

            //elephant : lenght = 8, length /2=4
            //01234567
            int first = str.length()/2-1; // first middle letter index
            int second = str.length()/2; // second middle letter index

            System.out.println("The middle character: "+str.charAt(first)+str.charAt(second));
            System.out.println("the middle character: "+ str.substring(first, second+1));

        }
    }
}
