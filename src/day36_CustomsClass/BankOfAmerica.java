package day36_CustomsClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BankOfAmerica {  //Bank of America HAS an Employee

    public static void main(String[] args) {

        String companyName = "Bank of America";
        Employee[] employees = {
                                new Employee(), //0
                                new Employee(), //1
                                new Employee(), //2
                                new Employee(), //3
                                new Employee()};//4
        employees[0].setInfo("Amira",'F',"SDET",companyName, 100000,
                            "123456789", LocalDate.of(1999,2,23));
        employees[1].setInfo("Rinat",'M',"QA",companyName,100000,
                            "987654321",LocalDate.of(1997,11,17));
        employees[2].setInfo("Maya",'F',"Developer",companyName,200000,
                            "13232",LocalDate.of(2020,1,1));
        employees[3].setInfo("Angelina Jolie",'F',"SM",companyName,400000,
                            "0022",LocalDate.of(2020,3,2));
        employees[4].setInfo("John",'M',"SDET",companyName,200000,
                            "007",LocalDate.of(2019,2,2));

        /*employees[0].getInfo();
        employees[1].getInfo();
        employees[2].getInfo();
        employees[3].getInfo();
        employees[4].getInfo();
         SAME AS BELOW */
        for(Employee each : employees){
            each.getInfo();
        }

        System.out.println("==================================================================");

        ArrayList<Employee> SdetAndDev = new ArrayList<>(Arrays.asList(employees));

        SdetAndDev.removeIf(p -> !(p.jobTitle.equalsIgnoreCase("SDET") || p.jobTitle.equalsIgnoreCase("Developer")));
        // removes the employees if the job title of the employee is not SDET or Developer

        for(Employee each : SdetAndDev){
            System.out.println(each.name+" : "+each.jobTitle+", $"+each.salary );
        }

        System.out.println("==================================================================");
        ArrayList<Employee> richPeople = new ArrayList<>(Arrays.asList(employees));
        richPeople. removeIf(p->p.salary<20000);
        //remove the employees, if the employee salary is less than 200k


        System.out.println("==================================================================");

        double maxSalary = employees[0].salary; // assume that first employee' salary is max

        for( Employee each : employees){
            //maxSalary = Math.max(maxSalary, each.salary);
        if(each.salary>maxSalary){
            maxSalary=each.salary;
        }

        }

        System.out.println(maxSalary);



    }
}

/*
Engine{

}

Car{
       Engine
}

//car has an engine

 */