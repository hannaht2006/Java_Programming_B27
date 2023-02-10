package day29_methods;

public class ExtraPractice {
    public static void main(String[] args) {

        int [] nums = {1, 24, 5, 12};

        System.out.println(sumFromArray(nums));

        System.out.println("---------------");
        System.out.println(currencyConvertor("yen", 100));
        System.out.println(currencyConvertor("rupee", 100));

        System.out.println("---------------");

    }
    /*
    Create a method that accept a int array. Take the sum of all number and return the sum
     */
    public static int sumFromArray (int[]nums){
        int sum = 0;
        for (int eachNum : nums){
            sum += eachNum;
        }
        return sum;
    }
    /*
    Currency Converter

create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type

Use the following information to convert from given dollars to the desired currency type

1 dollar = 0.91 euro
1 dollar = 121.03 yen
1 dollar = 14.85 lira
1 dollar = 1,217.52 won
1 dollar = 181.45 rupee
     */
    public static double currencyConvertor (String type, double dollar){
        double converted = 0;
        switch (type.toLowerCase()){
            case "euro":
                converted = dollar * 0.91;
             break;
            case "yen":
                converted = dollar * 121.03;
                break;
            case "lira":
                converted = dollar * 14.85;
                break;
            case "won":
                converted = dollar * 1217.52;
                break;
            case "rupee":
                converted = dollar * 181.45;
                break;
            default:
                System.out.println("We cannot convert to "+type);
        }
        return converted;
    }

}

