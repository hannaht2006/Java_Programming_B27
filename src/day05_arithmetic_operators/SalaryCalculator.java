package day05_arithmetic_operators;

public class SalaryCalculator {
    /*
    create a class SalaryCalculator
    add a main method
    declare and assign these variables:

       salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

    Sample data:
       100000 (salary)
       0.08 (state tax rate)
       0.21 (federal tax rate)

    Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

    Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
     */

    public static void main(String[] args) {
        String employee = "hannah";
        double salary = 120_000.00;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTax = salary*stateTaxRate;
        double federalTax = salary*federalTaxRate;
        double totalTax = stateTax+federalTax;
        double salaryAfterTax = salary -totalTax;
        System.out.println(employee+" salary calculator: ");
        System.out.println("salary: $ "+salary);
        System.out.println("state tax: $ "+ stateTax+ " (stateTaxRate = " + stateTaxRate+ ")");
        System.out.println("federalTax = $ " + federalTax+ "(federal tax rate = "+ federalTaxRate);
        System.out.println("totalTax = $" + totalTax);
        System.out.println("salaryAfterTax = $" + salaryAfterTax);

    }
}
