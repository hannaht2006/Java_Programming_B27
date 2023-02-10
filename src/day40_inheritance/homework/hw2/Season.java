package day40_inheritance.homework.hw2;

public class Season {
    /*
    Create a class Season

	instance variables
		- name (String)
		- highest average temperature
		- lowest average temperature

	constructor:
		- initialize all fields

	methods:
		- activity(), toString()
		*/

    String name;
    double highestAverageTemp;
    double lowestAverageTemp;

    public Season (String name,double highestAverageTemp,double lowestAverageTemp){
        this.name = name;
        this.lowestAverageTemp = lowestAverageTemp;
        this.highestAverageTemp = highestAverageTemp;
    }
    public void activity(){
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highestAverageTemp=" + highestAverageTemp +
                ", lowestAverageTemp=" + lowestAverageTemp +
                '}';
    }

    /*

		override activity in sub classes

Create a class Winter

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Print Use Fireplace

*/


    /*

Create a class Summer

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Drink Lemonade

Create a class Fall

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Read A Book

Create a class Spring

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Go Outside

Create a class CheckSeason

	create an object of Winter, Summer, Fall and Spring and verify if constructor, toString(), and activity() are working properly for each class

	List the is a relations of all the classes
     */
}
