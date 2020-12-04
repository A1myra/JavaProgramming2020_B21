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

    public void getInfo(){
        System.out.println("Student name : "+ name +"\nStudent ID : "+ID +"\nGPA: "+GPA+"\nAge: "+age + "" +
                "\nGender: "+gender);
    }





}
/*
Student:
        Attributes:
        name, age , gender, ID

        Actions:
        setInfo, getInfo, study

 */