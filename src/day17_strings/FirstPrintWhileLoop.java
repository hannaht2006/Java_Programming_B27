package day17_strings;

public class FirstPrintWhileLoop {
    public static void main(String[] args) {
        char first = 'A';
        while (first <='Z'){
            System.out.print(first++);

        }
        System.out.println();
        //printing z-a

        char backwards = 'z';
        while (backwards>='a'){
            System.out.print(backwards--);
        }
        /*
        iteration 1:
        first ='A';
        'A' < 'Z' true
        loop runs
        print(first) -> A
        then increments because of post increment
        first++ --> B
        iteration 2:
        B<Z true
        loop runs
        prints (first) -> B

         */
    }
}
