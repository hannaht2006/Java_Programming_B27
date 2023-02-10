package day40_inheritance.homework.hw3;

public class OlympicSport {
    /*
    Create a class OlympicSport

	instance variables
		- name (String)
		- participants (int)

	constructor:
		- initialize all fields

	methods:
		- compete(), toString()
*/
    String name;
    int participants;

    public OlympicSport (String name, int participants){
        this.name = name;
        this.participants = participants;
    }

    public void compete(){
        System.out.println("");
    }

    @Override
    public String toString() {
        return "OlympicSport{" +
                "name='" + name + '\'' +
                ", participants=" + participants +
                '}';
    }
    /*

		override compete in sub classes

Create a class Surfing

	child class of OlympicSport

	constructor: set name and participants variables

	methods:
		compete(): Print Surfing the waves

Create a class Track

	child class of OlympicSport

	constructor: set name and participants variables

	methods:
		compete(): Print Track for running, jumping, throwing

Create a class Soccer

	child class of OlympicSport

	constructor: set name and participants variables

	methods:
		compete(): Print Playing a soccer game
     */
}

