package day17_strings;

public class MoreMethods {
    public static void main(String[] args) {
// isEmpty()
        String s = "hello";
        System.out.println(s.isEmpty());// --> false

        String s2 = " ";
        System.out.println(s2.isEmpty());// --> false

        String s3 ="";//isEmpty() check if string but no characters --> return Boolean
        System.out.println(s3.isEmpty());// --> true
        System.out.println(s3.isBlank());// --> true

        System.out.println("----------------------");

 //isBlank() : check if the string has only space characters ; return boolean
        String a = "   ";// spaces are characters
        System.out.println(s.isEmpty());//---> false
        System.out.println(a.isBlank());// check for non-space characters ---> true

        String b = "b";
        System.out.println(b.isEmpty());
        System.out.println(b.isBlank());

        System.out.println("------------------------");
//replace
        String str = " java";
        String stra = str.replace('a','z');
        System.out.println(stra);
        String strb = str.replace("ja","zz");
        System.out.println(strb);

        String str2 = "an apple path";
        System.out.println(str2.replace("a", "(a)"));

        // common use case : to delete spaces between words, different from trim()
        String str3 = "  multiple words here  ";
        str3= str3.replace(" ", "");
        System.out.println(str3);
        // remove only first
        String z = "wooden spoon";
        System.out.println(z.replace("o","-"));
        System.out.println(z.replaceFirst("o","-"));

        // how to replace the middle character only
        String ex = "wooden spoon";
        int firstO = ex.indexOf('o');
        int secondO = ex.indexOf('o', firstO+1);
        System.out.println(ex.substring(0,secondO));
        System.out.println(ex.substring(0,secondO)+ ex.substring(secondO).replaceFirst("o","-"));


    }
}
