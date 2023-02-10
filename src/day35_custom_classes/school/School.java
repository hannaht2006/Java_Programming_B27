package day35_custom_classes.school;

public class School {
    String name;
    int totalNumberOfStudent;
    double avgGpa;
// this keyword allows us to access the instance variable, not the local variable

    public School(String name, int totalNumberOfStudent, double avgGpa) {
        this.name = name;
        this.totalNumberOfStudent = totalNumberOfStudent;
        this.avgGpa = avgGpa;
    }


//    public School(String inputName, int inputStudent, double inputGpa){
//        name = inputName;
//        totalNumberOfStudent = inputStudent;
//        avgGpa = inputGpa;
//
//    }


    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", totalNumberOfStudent=" + totalNumberOfStudent +
                ", avgGpa=" + avgGpa +
                '}';
    }
}
