package day34_custom_classes.student;

public class School {
    public static void main(String[] args) {
        Student studentOne = new Student();
        System.out.println(studentOne);// try print the whole object -> but we get some hashvalues

        //instance variable being assigned a value
        studentOne.name = "Olena";
        studentOne.batchNumber = 27;
        studentOne.program = "SDET";
        studentOne.grade = 99.99;
        System.out.println(studentOne);// still print out some hash values
        System.out.println(studentOne.name);
        System.out.println(studentOne.batchNumber);
        System.out.println(studentOne.program);
        System.out.println(studentOne.grade);
//call the instance method:
        //Student.study(); only work if method is static
        studentOne.study();

        System.out.println("---------------------");

        Student studentTwo = new Student();
        System.out.println(studentTwo.name);//--> null
        System.out.println(studentTwo.batchNumber);//->0
        System.out.println(studentTwo.program);//-> null
        System.out.println(studentTwo.grade);//-> 0.0

        studentTwo.study();

        /*
        in this case we created anew object of the student class
        it means this object was a fresh copy of the instance variables, which means they will have their default values
         */

    }
}
