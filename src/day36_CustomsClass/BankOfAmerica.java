package day36_CustomsClass;

import java.time.LocalDate;
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
        employees[0].getInfo();

        employees[1].setInfo("Rinat",'M',"QA",companyName,100000,
                            "987654321",LocalDate.of(1997,11,17));
        employees[1].getInfo();

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