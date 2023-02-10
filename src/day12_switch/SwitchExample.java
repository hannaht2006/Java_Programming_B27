package day12_switch;

public class SwitchExample {
    public static void main(String[] args) {

        int day = 3;// number from 1-7, where monday is 1 and 7 is sunday

        switch (day){
            default://acts like  "else":  if no other case match the default case will run
                // switch doesn't run frm top to bottom, it goes direct to the case match with the data enter in
                System.out.println("Not a valid day number, should be 1-7");
                break;
            case 1: // if (day == 1)
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

    }
}
