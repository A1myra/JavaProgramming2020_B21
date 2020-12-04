package day37_CostomClass;

import java.time.LocalDate;

public class Student {

    public String name, ID;
    public LocalDate DOfB;
    public int age;
    public char gender;
    public double GPA;

    public void setInfo( String name, char gender, LocalDate DOfB, String ID, double GPA ){
        this.name = name;
        this.gender= gender;
        this.DOfB = DOfB;
        this.ID=ID;
        this.GPA=GPA;
        age = LocalDate.now().getYear() - DOfB.getYear();
    }

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Age: "+age+", ID: "+ID+", Date Of Birth: "+DOfB+", GPA: "+GPA;
    }


}






/*
Student:
        Attributes:
        name, age , gender, ID

        Actions:
        setInfo, getInfo, study

 */