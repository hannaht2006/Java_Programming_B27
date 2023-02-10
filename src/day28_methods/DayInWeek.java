package day28_methods;

public class DayInWeek {
    public static void main(String[] args) {
        System.out.println(dayInWeek(4));
        System.out.println(dayInWeek(7));

        switch (dayInWeek(3)){
            case "Monday":

            case "Friday":
                System.out.println("Have full day of Java");
                break;
            case "Tuesday":
            case "Thurday":
                System.out.println("half Java, half Softskill");
                break;
            case "Wednesday":
                System.out.println("office hour");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("off");
        }
    }

    // day 1- Mon .... day 7- Sun

    public static String dayInWeek (int day){
        String [] days = {"Monday", "Tuesday", "Wednesday", "Thurday", "Friday", "Saturday", "Sunday"};
        return days [day - 1];// convert the number to index
    }
}
