package day37_static.student;

import java.util.Arrays;

public class Classroom {
    public static void main(String[] args) {

        CydeoStudent.schoolInfo();

        CydeoStudent mayla = new CydeoStudent("Mayla", "Toronto", 2);
        System.out.println(mayla);
        System.out.println(Arrays.toString(mayla.instructors));//not recommended, just use the class name to access

        System.out.println((Arrays.toString(CydeoStudent.instructors)));
        System.out.println(CydeoStudent.instructors[0].charAt(2));
        System.out.println(mayla.myCoffee.amountLeft);
        mayla.drink();
        System.out.println(mayla.myCoffee.amountLeft);

        System.out.println("--------------");

        CydeoStudent aili = new CydeoStudent("Aili", "Otawa", 1);
        System.out.println(aili.myCoffee.amountLeft);
        aili.drink();
        aili.drink();
        aili.drink();
        System.out.println("Aili left: "+aili.myCoffee.amountLeft);
        System.out.println("Mayla left: "+mayla.myCoffee.amountLeft);
    }
}
