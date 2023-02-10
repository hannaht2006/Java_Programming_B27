package day28_methods;

public class CharMethods {
    public static void main(String[] args) {
        getUpperAtoZ();
        getUpperZtoA();
        getLoweraToz();
        getLowwrztoa();
        getNumber0To9();
    }

    public static void getUpperAtoZ(){
        for (char letter ='A'; letter<= 'Z'; letter++){
            System.out.print(letter + " ");
        }
        System.out.println(); // to break the line , for the next code
    }

    public static void getLoweraToz(){
        for (char letter ='a'; letter<= 'z'; letter++){
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    public static void getUpperZtoA(){
        for (char letter ='Z'; letter>= 'A'; letter--){
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    public static void getLowwrztoa(){
        for (char letter ='z'; letter>= 'a'; letter--){ // int i = 'z; or int = 122
            System.out.print(letter + " "); // print ((char)i)
        }
        System.out.println();
    }
    public static void getNumber0To9(){
        for (char letter ='0'; letter <= '9'; letter++){
            System.out.print(letter + " ");
        }
        System.out.println();
    }

}
