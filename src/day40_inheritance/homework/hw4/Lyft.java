package day40_inheritance.homework.hw4;

public class Lyft {

}
    /*
    Create a class Lyft for ride sharing

	declare a method calculateRate(miles)
		return the cost of the ride: miles * 1.5
*/
  class Lyft1{
        public double calculateRate(double miles){
            return miles*1.5;
        }
    }

    /*

Create a class LyftXL

	child class of Lyft

	declare a method calculateRate(miles)
		return the cost of the ride: base rate of Lyft ride + 10%
*/
class LyftXL extends Lyft1{
    @Override
        public double calculateRate(double miles){
        return (miles*1.5)*1.1;
    }
    }
        /*

Create a class Lux

	child class of Lyft

	declare a method calculateRate(miles)
		return the cost of the ride: base rate of Lyft ride + 20%

     */
class Lux extends Lyft1{
    @Override
            public double calculateRate(double miles){
        return (miles*1.5)*1.2;
    }

        }

        class test{
            public static void main(String[] args) {
                LyftXL lyftxl = new LyftXL();
                lyftxl.calculateRate(45.5);
                System.out.println("Cost of the ride: "+lyftxl.calculateRate(45.5) );
            }
        }


