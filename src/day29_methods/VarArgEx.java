package day29_methods;

public class VarArgEx {

    public static void main(String[] args) {
        int[] a = {3, 1, 3, 5};
        printAll(a);
       // printAll(3, 1, 2, 5); this is not valid because it is not an array

        //dynamic(a); this works
        dynamic(4, 1, 3, 2);
        dynamic("hello", "world");

    }

    public static void printAll(int[] nums) {
        for (int each : nums) {
            System.out.print(each + " ");
        }
    }
    public static void dynamic(int ... nums) { // int ... nums is the same as int [] nums
        for (int  each : nums) {
            System.out.print(each + " ");
        }
    }
    public static void dynamic(String ... words) {//String ... words is the same as String [] words
        for (String  each : words) {
            System.out.println(each + " ");
        }
    }
}
