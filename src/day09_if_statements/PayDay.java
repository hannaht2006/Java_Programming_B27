package day09_if_statements;

public class PayDay {
    public static void main(String[] args) {

        double hourlyRate = 60;
        int hourPerWeek = 50;
        double netPay;

        if (hourPerWeek > 40) {
            //overtime calculation
            int overtimeHours = hourPerWeek - 40;
            netPay = hourlyRate * 40;// calculate the normal pay for the 40 hours week
            netPay +=overtimeHours*hourlyRate*1.5; // total earned from overtime

        } else {
            // work under or equal 40 hours, so no overtime
            netPay = hourlyRate * hourPerWeek;
        }
        System.out.println("net pay: "+ netPay);
    }
}
