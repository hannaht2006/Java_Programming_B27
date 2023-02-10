package day03_variable;

public class DateTomorrow {
    public static void main(String[] args) {
/*
declaire and assign 3 variables(numbers) month, day, year
print the date in this format:
Date: month\ day \ year
also update the day for tomorrow date
print tomorrow's date in this format :
tomorrow's Date" month \ day \ year
 */
        int month, day, year;  // made 3 variable, all of them are int type
        month = 6;
        day = 12;
        year = 2022;
        // altenative declaration and assignment : int month is 6, day = 12, year = 2022

        System.out.println("Date: " + month + "\\" + day + "\\" + year ); //show date for tomorrow
        day = 13;
        System.out.println("Tomorrow's Date: " + month + "\\" + day +"\\" + year);


     }
}
