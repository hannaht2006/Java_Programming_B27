package day30_practice_wrapper;

public class NullIdea {
    public static void main(String[] args) {

        String [] a = {"hello", "world", "friday"};
        System.out.println(a[0]);
        System.out.println(a[0].charAt(0));

        String [] b = new String [2];// [null, null]
        System.out.println(b[0]);// --> null
        System.out.println(b[0].charAt(0)); //the same with null.charAt(0)---> NullPointerException : no actual object created


    }
}
