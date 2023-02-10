package day37_static.student;

import java.util.Arrays;

public class CydeoStudent {

    //instance variable
    String name;
    String city;
    int group;
    Coffee myCoffee;

    //static variable
    static int batchNumber;
    static String schoolName;
    static String [] instructors; //static means one copy, belongs to class, all object share. String [] type

    static {
        batchNumber = 27;
        schoolName = "Cydeo";
        instructors = new String []{"Adam", "Asya", "Saim"};//creating a new String array and assigning into the instructors reference

        /* instead  of line 18 :
        instructors = new String [3];
        instructors [0] = "Adam";
        instructors [1] = "Asya";
        instructors [2] = "Saim";

        //another alternative:
        instructors = ("Adam Asysa Saim").Split(" ");
         */
    }

    public CydeoStudent(String name, String city, int group) {
        this.name = name;
        this.city = city;
        this.group = group;
        myCoffee = new Coffee(16);//16 oz of coffee

    }
    public static void schoolInfo(){
        System.out.println(schoolName + " Batch "+ batchNumber);
        System.out.println("Instructors "+ Arrays.toString(instructors));
    }
    public void drink(){
        myCoffee.amountLeft -=2;
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", group=" + group +
                '}';
    }
}
