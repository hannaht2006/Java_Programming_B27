package day16_string;

public class DynamicIndexOf {
    public static void main(String[] args) {

        String str = "mississippi";
        //            0123456789
        // goal is to find all the indexes of all the 'i' characters

        System.out.println("First i: "+ str.indexOf('i'));
        System.out.println("Last i: "+ str.lastIndexOf('i'));
        System.out.println("first middle i: "+ str.indexOf("issip"));
        System.out.println("second middle i:"+str.indexOf("ipp"));

        System.out.println("other use of indexOf:");

        System.out.println("First i: "+ str.indexOf('i'));
        System.out.println("second i: "+ str.indexOf('i', 4));
        System.out.println("third i: "+ str.indexOf('i', 6));

        System.out.println("Hard code above ------ Dynamic below");

        int firstI = str.indexOf('i');
        int secondI = str.indexOf('i',firstI + 1);// take previous index + 1 to it, so we can start looking for the next i
        int thirdI = str.indexOf('i',secondI+1);

        System.out.println("First i: "+ firstI);
        System.out.println("second i: "+ secondI);
        System.out.println("thirdI: "+ thirdI);




    }
}
