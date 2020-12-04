package day37_CostomClass;

public class Employee {

    public String name, company, jobTitle, ID, gender;
    public int weeklyHours;
    public double hourlyRate, salary, totalTax, salaryAfterTax;

    public double calculateSalary (){
        return hourlyRate * weeklyHours *52;
    }

    public double calculateTax ( double stateTaxRate, double federalTaxRate){
        return calculateSalary() * stateTaxRate + calculateSalary() * federalTaxRate;
    }


}
