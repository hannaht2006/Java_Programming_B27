package day02_print_statements;

public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Today is");
       // System.out.print("Friday""); this is not valid because it thinks the double quotation is for java syntax, but we want to print the character of double quotation
        System.out.println("\"here\"");
        System.out.println("today is \"Friday\"");
        // i want to print a\
        System.out.println("\\"); // first \ is syntax, the second \ is the character we want to print
        System.out.println("\t Hello");
        System.out.println("\t\t Hello");
        // next line
        System.out.println("Shopping list:\n1)Juice\n2)Pear\n3/Pillow");
        System.out.println();
        System.out.println("Shopping list:\n\t1)Juice\n\t2)Pear\n\t3/Pillow");
    }


}
