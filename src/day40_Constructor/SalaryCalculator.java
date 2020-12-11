package day40_Constructor;

public class SalaryCalculator {
    public static int numberOfWorkingDays, numberOfWeeks;

    public double weeklyHours, hourlyRate, stateTaxRate, federalTaxRate,salary, salaryAfterTax , totalTax;

    static {
        numberOfWorkingDays = 5;
        numberOfWeeks = 52;
    }

    public SalaryCalculator ( double weeklyHours, double hourlyRate, double stateTaxRate, double federalTaxRate ){

        if(stateTaxRate > 1){
            stateTaxRate/=100;
        }

        if(federalTaxRate > 1){
            federalTaxRate/=100;
        }

        this.weeklyHours=weeklyHours;
        this.hourlyRate=hourlyRate;
        this.stateTaxRate=stateTaxRate;
        this.federalTaxRate=federalTaxRate;
        salary=weeklyHours * hourlyRate * numberOfWeeks;
        totalTax = (stateTaxRate+federalTaxRate)*salary;
        salaryAfterTax=salary-totalTax;



    }

    public String toString() {
        return "SalaryCalculator{" +
                "weeklyHours=" + weeklyHours +
                ", hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salary=" + salary +
                ", salaryAfterTax=" + salaryAfterTax +
                ", totalTax=" + totalTax +
                '}';
    }
}
