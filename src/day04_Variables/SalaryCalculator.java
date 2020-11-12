package day04_Variables;

public class SalaryCalculator {

    /*
salary = 100000
taxRate = 0.28
totalTax = salary * taxRate
salary after tax = salary - totalTax
 */

        public static void main(String[] args) {
            int Salary = 100000;
            double tax = 0.28;
            double totalTax = Salary * tax;
            double SalaryAfterTax = Salary - totalTax;
            System.out.println(" The Salary after tax is: ");
            System.out.println();
            System.out.println(SalaryAfterTax);
        }
    }




