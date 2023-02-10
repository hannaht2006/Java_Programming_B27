package day27_methods;

public class FirstMethod { // no main method

    public static void helloWorld(){ // helloWorld method

        System.out.println("Hello World!");
    }
    public static void helloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
    }

        public static void main (String[]args){ // call main method here to run code
            helloWorld(); // call helloWorld method here and now we can run
            helloWorld();

            // print hello world 5 times:

            for (int i = 0; i < 5; i++) {
                helloWorld();
            }

            // print hello world 5 times by calling helloWorld5Times method:

            System.out.println("----------");
            helloWorld5Times(); // prints hello world 5 times

        }
    }


