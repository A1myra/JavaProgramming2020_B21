package day05_Concatenation;

public class SalaryCalculator {

    public static void main(String[] args) {

        int Salary = 100000;
        double StateTax = 0.08;
        double federalTax = 0.21;
        double totalTax = Salary * StateTax;
        double salaryaftertax = Salary - totalTax;

        System.out.println("your salary is: "+Salary);
        System.out.println("your state tax: "+StateTax);
        System.out.println("your federal tax: "+federalTax);
        System.out.println("your total tax: "+totalTax);
        System.out.println("your salary after tax: "+salaryaftertax);

    }
}

/*
Variables: salary, stateTaxRate, federalTaxRate, stateTax, federalTax, totalTax, salaryAfterTax

output:
your salary is: YourSalary -------100000
Your state tax: YoruStateTax ------0.08
your federal tax: federalTax -----0.21
your total tax: TotalTax
your salary after tax: YourSalaryAfterTax
 */