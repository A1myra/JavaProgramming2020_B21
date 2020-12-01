package day35_CustomClass;

import java.time.LocalDate;

public class Dog {

    public String nickName;
    public String breed;
    public String size;
    public char gender;
    public String color;
    public LocalDate DofB;
    public int age;


    //sets the instance variables of dog objects
    public void setInfo(String dogNickname, String dogBreed,String dogSize, char dogGender,String dogColor,LocalDate dogDateOfBirth){
        nickName=dogNickname;
        breed=dogBreed;
        size=dogSize;
        gender=dogGender;
        color=dogColor;
        DofB=dogDateOfBirth;
        age=LocalDate.now().getYear() - DofB.getYear();


    }

    //to print the info of the dog objects
    public void getInfo(){
        System.out.println("Name: "+nickName+", Breed: "+breed+", Size: "+size+
                            ", Gender: "+gender+", Color: "+color+", Age: "+ age);
    }

    public void eat(String food){
        System.out.println(nickName+" is eating "+food);
    }

    public void drink(String drinks){
        System.out.println(nickName+" is drinking "+drinks);
    }




}
