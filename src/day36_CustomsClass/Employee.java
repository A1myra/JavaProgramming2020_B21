package day36_CustomsClass;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {


        public String name, jobTitle, ID, companyName ;
        public double salary;
        public LocalDate hireDate;
        public char gender;

        public void setInfo(String name, char gender, String jobTitle, String companyName, double salary, String ID, LocalDate hireDate ){
            this.name = name;  // instance = local
            this.gender = gender;
            this.jobTitle =jobTitle;
            this.companyName = companyName;
            this.salary = salary;
            this.ID = ID;
            this.hireDate = hireDate;
        }


        public void getInfo(){
            DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
            DecimalFormat decimal = new DecimalFormat("0.00");
            System.out.println("Name: "+name+", Gender: "+gender+", ID: "+ID+", Company Name: "+companyName
                    +", Job Title: "+jobTitle+", salary: $"+decimal.format(salary)+", Hired "+hireDate.format(df));
        }

        public void working(){
            System.out.println(name+" is working");
        }

        public void meeting(){
            System.out.println(name+" is in a meeting");
        }



    }
