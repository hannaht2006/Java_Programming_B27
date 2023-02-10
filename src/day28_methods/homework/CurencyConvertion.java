package day28_methods.homework;

public class CurencyConvertion {
    /*
    Currency Converter

create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type

Use the following information to convert from given dollars to the desired currency type

1 dollar = 0.91 euro
1 dollar = 121.03 yen
1 dollar = 14.85 lira
1 dollar = 1,217.52 won
1 dollar = 181.45 rupee

Note: Don't worry about decimal formats, focus on method

Ex:
	Input:
		euro, 100

	Output:
		91

Ex:
	Input:
		yen, 50

	Output:
		6051.5
     */

    public static void main(String[] args) {
        String str = "yen";
        double n = 3;
        System.out.println(currencyConversion(str,n));
    }
    public static double currencyConversion(String str,double n ){
        String [] currency = {"euro", "yen", "lira","won","rupee"};
                double result =0;

                    if (str.equals(currency[0])){
                       result = n*0.91;

                    }else if (str.equals(currency[1])){
                        result = n*121.03;

                    }else if (str.equals(currency[2])){
                        result = n*14.85;

                    }else if (str.equals(currency[3])){
                        result = n*1217.52;

                    }else if (str.equals(currency[4])) {
                        result = n * 181.45;
                    }
        return result;
    }
}
