package day35_custom_classes;

public class LocalVsInstance {

    int a = 5;
    int b = 10;
    public LocalVsInstance (int a, int z){ // a & z here are local variable
        this.a = a;//local a is prioritized, which means here you are reassigning the local variable to itself, but that means the instance a did not change
        //this.a : to refference a is instance variable
        b = z;
    }

    public void print (){
        System.out.println(a);
    }

    public static void main(String[] args) {
        LocalVsInstance obj = new LocalVsInstance(20, 50);
        System.out.println(obj.a);
    }
}
