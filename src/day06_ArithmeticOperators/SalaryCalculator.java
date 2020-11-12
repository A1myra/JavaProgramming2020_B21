package day06_ArithmeticOperators;

public class SalaryCalculator {

    public static void main(String[] args) {

       /* Task01: SalaryCalculator
        variables: salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
        100000    0.08         0.21
        output:
        Your salary is: YourSalary
        Your State Tax: YourStateTax
        Your federal Tax: federalTax
        your total tax: TotalTax
        your salary after tax: YourSalaryAfterTax
       */

        double Salary = 100000;
        double StateTaxRate = 0.08;
        double FederalTaxRate = 0.21;
        double StateTax = Salary * StateTaxRate;
        double FederalTax = Salary * FederalTaxRate;
        double TotalTax = StateTax + FederalTax;
        double SalaryAfterTax = Salary - TotalTax;

        /*declare those double variable just in one data type
        double salary = 100000, StateTaxRate = 0.08, FederalTaxRate = 0.21,
                statetax = salary*StateTaxRate, federaltax = salary*FederalTaxRate,
                like this, but other one is clear and recomended.
         */

        System.out.println("Your Salary is: $"+Salary);
        System.out.println("Your State Tax is: $"+StateTax);
        System.out.println("Your federal Tax is: $"+FederalTax);
        System.out.println("Your Total Tax is: $"+TotalTax);
        System.out.println("Your Salary After Tax: $"+SalaryAfterTax);




    }
}
