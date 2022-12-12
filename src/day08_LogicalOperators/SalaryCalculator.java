package day08_LogicalOperators;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 50,
            weeklyHours = 45;
        double stateTaxRate = 6.5,
               federalTaxRate = 26.2;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;

        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        System.out.println("Gross pay is: $ " + salaryBeforeTax);
        System.out.println("stateTax = $" + stateTax);

        double federalTax = salaryBeforeTax * federalTaxRate /100;
        System.out.println("salaryBeforeTax = " + salaryBeforeTax);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        double totalTax = stateTax + federalTax;
        System.out.println("totalTax = " + totalTax);


    }
}
